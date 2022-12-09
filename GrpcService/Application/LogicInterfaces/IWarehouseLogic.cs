using Shared.DTOs;
using Shared.Models;

namespace Application.LogicInterfaces;

public interface IWarehouseLogic
{
    Task<Product> CreateAsync(ProductCreationDto userToCreate);
    Task DeleteProductAsync(string ean);
    Task<List<Product>> RetrieveProductsAsync();
    Task<bool> UpdateAsync(WarehouseUpdateDto dto);
    Task<Shared.Models.Product> RetrieveProductAsync(string ean);
    Task<bool> UpdateStockIngoingAsync(List<string> eans);
    Task<bool> UpdateStockOutgoingAsync(List<string> eans);
}