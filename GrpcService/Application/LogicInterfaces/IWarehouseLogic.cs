using Shared.DTOs;
using Shared.Models;

namespace Application.LogicInterfaces;

public interface IWarehouseLogic
{
    Task<Product> CreateAsync(ProductCreationDto userToCreate);
    Task DeleteProductAsync(long ean);
    Task<List<Product>> RetrieveProductsAsync();
    Task<bool> UpdateAsync(WarehouseUpdateDto dto);
    Task<Shared.Models.Product> RetrieveProductAsync(long ean);
    Task<bool> UpdateStockIngoingAsync(List<long> eans);
    Task<bool> UpdateStockOutgoingAsync(List<long> eans);
}