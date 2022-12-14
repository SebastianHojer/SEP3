using Shared.DTOs;
using Shared.Models;

namespace Application.LogicInterfaces;

public interface IWarehouseLogic
{
    Task<Product> CreateAsync(ProductCreationDto userToCreate);
    Task DeleteProductAsync(long ean);
    Task<List<Product>> RetrieveProductsAsync();
    Task<bool> UpdateAsync(WarehouseUpdateDto dto);
    Task<Product> RetrieveProductAsync(long ean);
    Task<bool> UpdateStockIngoingAsync(List<long> eans);
    Task<bool> UpdateStockOutgoingAsync(List<long> eans);
    Task<List<long>> RetrieveAllProductsEanAsync();
    Task<bool> RegisterLoss(Dictionary<long, int> dictionary);
    Task<Loss> RetrieveLossAsync(int caseId);
    Task<List<Loss>> RetrieveAllLossAsync();
    Task<bool> UpdateLossAsync(Loss loss);
    Task DeleteLossAsync(int caseId);
}