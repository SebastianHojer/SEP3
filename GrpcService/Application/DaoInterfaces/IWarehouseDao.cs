using Shared.DTOs;
using Shared.Models;

namespace Application.DaoInterfaces;

public interface IWarehouseDao
{
    Task<Product> CreateProductAsync(Product product);
    Task<bool> ProductExistsAsync(long ean);
    Task DeleteProductAsync(long ean);
    Task<List<Product>> RetrieveProductsAsync();
    Task<Shared.Models.Product> RetrieveProductAsync(long ean);
    Task<bool> UpdateAsync(Product product);
    Task<bool> UpdateStockOutgoingAsync(List<long> eans);
    Task<bool> UpdateStockIngoingAsync(List<long> eans);
    Task<List<long>> RetrieveAllProductsEanAsync();
    Task<bool> RegisterLossAsync(Dictionary<long, int> dictionary);
}