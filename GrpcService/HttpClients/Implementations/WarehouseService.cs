using System.Net;
using System.Net.Http.Json;
using System.Security.AccessControl;
using System.Text;
using System.Text.Json;
using HttpClients.ClientInterfaces;
using Shared.DTOs;
using Shared.Models;

namespace HttpClients.Implementations;

public class WarehouseService : IWarehouseService
{
    private readonly HttpClient client;

    public WarehouseService(HttpClient client)
    {
        this.client = client;
    }

    public async Task<Product> CreateAsync(ProductCreationDto dto)
    {
        HttpResponseMessage response = await client.PostAsJsonAsync("/warehouse", dto);
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        Product product = JsonSerializer.Deserialize<Product>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return product;
    }

    public async Task DeleteAsync(Product product)
    {
        HttpResponseMessage response = await client.DeleteAsync($"/warehouse?ean={product.Ean}");
        if (!response.IsSuccessStatusCode)
        {
            string content = await response.Content.ReadAsStringAsync();
            throw new Exception(content);
        }
    }

    public async Task<IEnumerable<Product>> RetrieveAsync()
    {
        HttpResponseMessage responseMessage = await client.GetAsync("/warehouse");
        string result = await responseMessage.Content.ReadAsStringAsync();
        if (!responseMessage.IsSuccessStatusCode)
        {
            string content = await responseMessage.Content.ReadAsStringAsync();
            throw new Exception(content);
        }

        IEnumerable<Product> products = JsonSerializer.Deserialize<IEnumerable<Product>>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return products;
    }
    public async Task UpdateAsync(WarehouseUpdateDto dto)
    {
        string dtoAsJson = JsonSerializer.Serialize(dto);
        StringContent body = new StringContent(dtoAsJson, Encoding.UTF8, "application/json");

        HttpResponseMessage response = await client.PatchAsync("/warehouse", body);
        if (!response.IsSuccessStatusCode)
        {
            string content = await response.Content.ReadAsStringAsync();
            throw new Exception(content);
        }
    }
}