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

    public async Task<bool> CreateProductAsync(ProductCreationDto dto)
    {
        ProductCreationResponse response = await warehouseClient.createProductAsync(new ProductCreationRequest(){ToCreate = new Product(){Ean = dto.ean, Information = dto.information, Stock = dto.stock, ProductName = dto.productName}});
        return response.Created;
    }
}