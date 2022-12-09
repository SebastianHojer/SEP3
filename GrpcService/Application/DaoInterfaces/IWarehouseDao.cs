using Shared.DTOs;
using Shared.Models;

namespace Application.DaoInterfaces;

public interface IWarehouseDao
{
    Task<Product> CreateProductAsync(Product product);
    Task<bool> ProductExistsAsync(string ean);
    Task DeleteProductAsync(string ean);
    Task<List<Product>> RetrieveProductsAsync();
    Task<Shared.Models.Product> RetrieveProductAsync(string ean);
    Task<bool> UpdateAsync(Product product);
    Task<bool> UpdateStockOutgoingAsync(List<string> eans);
    Task<bool> UpdateStockIngoingAsync(List<string> eans);
}