using Shared.DTOs;
using Shared.Models;

namespace HttpClients.ClientInterfaces;

public interface IWarehouseService
{
    Task<Product> CreateAsync(ProductCreationDto dto);
    Task DeleteAsync(Product product);
    Task<IEnumerable<Product>> RetrieveAsync(string? ean);
    Task UpdateAsync(WarehouseUpdateDto dto);
}