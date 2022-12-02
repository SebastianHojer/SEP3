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
        ProductCreationResponse response = await warehouseClient.createProductAsync(new ProductCreationRequest(){Ean = dto.ean, ProductName = dto.productName, Information = dto.information, Stock = dto.stock});
        return response.Created;
    }
}