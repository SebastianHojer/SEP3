using System.Net.Http.Json;
using System.Text.Json;
using HttpClients.ClientInterfaces;
using Shared.DTOs;
using Shared.Models;

namespace HttpClients.Implementations;

public class UserService : IUserService
{
    private readonly HttpClient client;

    public UserService(HttpClient client)
    {
        this.client = client;
    }

    public async Task<User> Create(UserCreationDto dto)
    {
        HttpResponseMessage response = await client.PostAsJsonAsync("/user", dto);
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        User user = JsonSerializer.Deserialize<User>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return user;
    }

    public async Task Delete(string username)
    {
        HttpResponseMessage response = await client.DeleteAsync($"/User?username={username}");
        if (!response.IsSuccessStatusCode)
        {
            string content = await response.Content.ReadAsStringAsync();
            throw new Exception(content);
        }
    }

    public async Task<List<string>> Retrieve()
    {
        HttpResponseMessage responseMessage = await client.GetAsync("/user");
        string result = await responseMessage.Content.ReadAsStringAsync();
        if (!responseMessage.IsSuccessStatusCode)
        {
            string content = await responseMessage.Content.ReadAsStringAsync();
            throw new Exception(content);
        }
        List<string> usernames = JsonSerializer.Deserialize<List<string>>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return usernames;
    }
}