using Shared.DTOs;
using Shared.Models;

namespace Application.DaoInterfaces;

public interface IWarehouseDao
{
    Task<Product> CreateProductAsync(ProductCreationDto dto);
}