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

    public async Task<Product> CreateProductAsync(ProductCreationDto dto)
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

    public async Task DeleteProductAsync(Product product)
    {
        HttpResponseMessage response = await client.DeleteAsync($"/warehouse?ean={product.Ean}");
        if (!response.IsSuccessStatusCode)
        {
            string content = await response.Content.ReadAsStringAsync();
            throw new Exception(content);
        }
    }
    
    public async Task<IEnumerable<Product>> RetrieveProductAsync(long? ean)
    {
        if (ean == null | ean == 0)
        {
            var responseMessage = await client.GetAsync($"/warehouse");
            var result = await responseMessage.Content.ReadAsStringAsync();
            if (!responseMessage.IsSuccessStatusCode)
            {
                var content = await responseMessage.Content.ReadAsStringAsync();
                throw new Exception(content);
            }

            var products = JsonSerializer.Deserialize<IEnumerable<Product>>(result, new JsonSerializerOptions
            {
                PropertyNameCaseInsensitive = true
            })!;
            return products;
        }
        else
        {
            var responseMessage = await client.GetAsync($"/warehouse?ean={ean}");
            var result = await responseMessage.Content.ReadAsStringAsync();
            if (!responseMessage.IsSuccessStatusCode)
            {
                var content = await responseMessage.Content.ReadAsStringAsync();
                throw new Exception(content);
            }

            var products = JsonSerializer.Deserialize<IEnumerable<Product>>(result, new JsonSerializerOptions
            {
                PropertyNameCaseInsensitive = true
            })!;
            return products;
        }
    }
    
    public async Task UpdateProductAsync(WarehouseUpdateDto dto)
    {
        var dtoAsJson = JsonSerializer.Serialize(dto);
        var body = new StringContent(dtoAsJson, Encoding.UTF8, "application/json");

        var response = await client.PatchAsync($"/warehouse?ean={dto.Ean}", body);
        if (!response.IsSuccessStatusCode)
        {
            var content = await response.Content.ReadAsStringAsync();
            throw new Exception(content);
        }
    }

    public async Task StockUpdateAsync(StockDto dto)
    {
        var dtoAsJson = JsonSerializer.Serialize(dto);
        var body = new StringContent(dtoAsJson, Encoding.UTF8, "application/json");
        var response = await client.PatchAsync($"/stock", body);
            if (!response.IsSuccessStatusCode)
            {
                var content = await response.Content.ReadAsStringAsync();
                throw new Exception(content);
            }
    }

    public async Task<List<long>> RetrieveStock()
    {
        var response = await client.GetAsync("/stock");
        var result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            string content = await response.Content.ReadAsStringAsync();
            throw new Exception(content);
        }

        var eans = JsonSerializer.Deserialize<List<long>>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return eans;
    }

    public async Task RegisterLoss(Dictionary<long, int> dictionary)
    {
        var response = await client.PostAsJsonAsync("/loss", dictionary);
        var result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
    }

    public async Task<IEnumerable<Loss>> RetrieveLossAsync(int? caseId)
    {
        if (caseId == null | caseId == 0)
        {
            var responseMessage = await client.GetAsync($"/loss");
            var result = await responseMessage.Content.ReadAsStringAsync();
            if (!responseMessage.IsSuccessStatusCode)
            {
                string content = await responseMessage.Content.ReadAsStringAsync();
                throw new Exception(content);
            }

            var losses = JsonSerializer.Deserialize<IEnumerable<Loss>>(result, new JsonSerializerOptions
            {
                PropertyNameCaseInsensitive = true
            })!;
            return losses;
        }
        else
        {
            var responseMessage = await client.GetAsync($"/loss?caseId={caseId}");
            var result = await responseMessage.Content.ReadAsStringAsync();
            if (!responseMessage.IsSuccessStatusCode)
            {
                string content = await responseMessage.Content.ReadAsStringAsync();
                throw new Exception(content);
            }

            var losses = JsonSerializer.Deserialize<IEnumerable<Loss>>(result, new JsonSerializerOptions
            {
                PropertyNameCaseInsensitive = true
            })!;
            return losses;
        }
    }
    
    public async Task DeleteLossAsync(int caseId)
    {
        var response = await client.DeleteAsync($"/loss?caseId={caseId}");
        if (!response.IsSuccessStatusCode)
        {
            var content = await response.Content.ReadAsStringAsync();
            throw new Exception(content);
        }
    }
    
    public async Task LossUpdateAsync(Loss loss)
    {
        var dtoAsJson = JsonSerializer.Serialize(loss);
        var body = new StringContent(dtoAsJson, Encoding.UTF8, "application/json");
        var response = await client.PatchAsync($"/loss", body);
        if (!response.IsSuccessStatusCode)
        {
            var content = await response.Content.ReadAsStringAsync();
            throw new Exception(content);
        }
    }
}
