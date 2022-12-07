using System.Net;
using System.Net.Http.Json;
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
        HttpResponseMessage response = await client.PostAsJsonAsync("/product", dto);
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
        HttpResponseMessage response = await client.DeleteAsync($"/Product?product={product}");
        if (!response.IsSuccessStatusCode)
        {
            string content = await response.Content.ReadAsStringAsync();
            throw new Exception(content);
        }
    }

    public async Task<List<Product>> RetrieveAsync()
    {
        HttpResponseMessage responseMessage = await client.GetAsync("/product");
        string result = await responseMessage.Content.ReadAsStringAsync();
        if (!responseMessage.IsSuccessStatusCode)
        {
            string content = await responseMessage.Content.ReadAsStringAsync();
            throw new Exception(content);
        }

        List<Product> products = JsonSerializer.Deserialize<List<Product>>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return products;
    }
}