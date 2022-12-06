using Shared.DTOs;
using Shared.Models;

namespace HttpClients.ClientInterfaces;

public interface IProductService
{
    Task<Product> Create(ProductCreationDto dto);
}