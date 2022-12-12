using Shared.DTOs;
using Shared.Models;

namespace HttpClients.ClientInterfaces;

public interface IWarehouseService
{
    Task<Product> CreateAsync(ProductCreationDto dto);
    Task DeleteAsync(Product product);
    Task<IEnumerable<Product>> RetrieveAsync(long? ean);
    Task UpdateAsync(WarehouseUpdateDto dto);
    Task StockUpdateAsync(StockDto dto);
}