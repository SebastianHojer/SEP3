using System.Net.Http.Json;
using System.Text.Json;
using HttpClients.ClientInterfaces;
using Shared.DTOs;
using Shared.Models;

namespace HttpClients.Implementations;

public class ProductService : IProductService
{
    private readonly HttpClient client;

    public async Task<Product> Create(ProductCreationDto dto)
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

    public async Task Delete(Product product)
    {
        HttpResponseMessage response = await client.DeleteAsync($"/Product?product={product}");
        if (!response.IsSuccessStatusCode)
        {
            string content = await response.Content.ReadAsStringAsync();
            throw new Exception(content);
        }
    }

    public async Task<List<Product>> Retrieve()
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