using Shared.DTOs;
using Shared.Models;

namespace Application.LogicInterfaces;

public interface IWarehouseLogic
{
    Task<Product> CreateAsync(ProductCreationDto userToCreate);
    Task DeleteProductAsync(string ean);
    Task<List<Product>> RetrieveProductsAsync();
    Task UpdateAsync(WarehouseUpdateDto dto);
}