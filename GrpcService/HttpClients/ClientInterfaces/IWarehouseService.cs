using Shared.DTOs;
using Shared.Models;

namespace HttpClients.ClientInterfaces;

public interface IWarehouseService
{
    Task<Product> CreateProductAsync(ProductCreationDto dto);
    Task DeleteProductAsync(Product product);
    Task<IEnumerable<Product>> RetrieveProductAsync(long? ean);
    Task UpdateProductAsync(WarehouseUpdateDto dto);
    Task StockUpdateAsync(StockDto dto);
    Task<List<long>> RetrieveStock();
    Task RegisterLoss(Dictionary<long, int> dictionary);
    Task<IEnumerable<Loss>> RetrieveLossAsync(int? caseId);
    Task DeleteLossAsync(int caseId);
    Task LossUpdateAsync(Loss loss);
}