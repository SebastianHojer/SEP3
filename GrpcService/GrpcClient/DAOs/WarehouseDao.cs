using Shared.DTOs;

namespace GrpcClient.DAOs;

public class WarehouseDao
{
    private readonly GrpcDao grpcDao;
    private Warehouse.WarehouseClient warehouseClient;

    public WarehouseDao()
    {
        grpcDao = GrpcDao.Instance;
        warehouseClient = grpcDao.getWarehouseClient();
    }

    public async Task<bool> CreateProduct(ProductCreationDto dto)
    {
        ProductCreationResponse response = await warehouseClient.createProductAsync(new ProductCreationRequest(){Ean = dto.Ean, ProductName = dto.ProductName, Information = dto.Information, Stock = dto.Stock});
        return response.Created;
    }
}