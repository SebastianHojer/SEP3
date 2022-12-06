using Shared.DTOs;
using Shared.Models;

namespace Application.DaoInterfaces;

public interface IWarehouseDao
{
    Task<Product> CreateProductAsync(Product product);
    Task<bool> ProductExistsAsync(string ean);
    Task DeleteProductAsync(string ean);
    Task<List<Product>> RetrieveProducts();
}