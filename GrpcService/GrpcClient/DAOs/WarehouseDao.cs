using Application.DaoInterfaces;
using Shared.DTOs;
using Shared.Models;

namespace GrpcClient.DAOs;

public class WarehouseDao : IWarehouseDao
{
    private readonly GrpcDao grpcDao;
    private Warehouse.WarehouseClient warehouseClient;

    public WarehouseDao()
    {
        grpcDao = GrpcDao.Instance;
        warehouseClient = grpcDao.getWarehouseClient();
    }

    public async Task<Shared.Models.Product> CreateProductAsync(Shared.Models.Product product)
    {
        await warehouseClient.createProductAsync(new ProductCreationRequest(){ToCreate = new Product(){Ean = product.Ean, Stock = product.Stock, ProductName = product.ProductName, PhotoPath = product.PhotoPath}});
        return product;
    }

    public async Task<bool> ProductExistsAsync(long ean)
    {
        ProductExistsResponse response =
            await warehouseClient.productExistsAsync(new ProductExistsRequest() { Ean = ean });
        return response.Exists;
    }

    public async Task DeleteProductAsync(long ean)
    {
        await warehouseClient.deleteProductAsync(new DeleteProductRequest(){Ean = ean});
    }

    public async Task<Shared.Models.Product> RetrieveProductAsync(long ean)
    {
        var response = await warehouseClient.retrieveProductAsync(new RetrieveProductRequest() { Ean = ean });
        List<string> location = new List<string>();
        foreach (var s in response.Product.Location)
        {
            location.Add(s);
        }
        var product = new Shared.Models.Product(response.Product.Ean, response.Product.ProductName, response.Product.Stock, response.Product.PhotoPath, location);
        return product;
    } 

    public async Task<bool> UpdateAsync(Shared.Models.Product product)
    {
        Product productToUpdate = new Product();
        productToUpdate.Ean = product.Ean;
        productToUpdate.Stock = product.Stock;
        productToUpdate.PhotoPath = product.PhotoPath;
        productToUpdate.ProductName = product.ProductName;
        productToUpdate.Location.AddRange(product.Location);
        var response = await warehouseClient.updateProductAsync(new UpdateProductRequest() { Product = productToUpdate });
        return response.Updated;
    }

    public async Task<List<Shared.Models.Product>> RetrieveProductsAsync()
    {
        var response = await warehouseClient.retrieveProductsAsync(new RetrieveProductsRequest());
        var products = new List<Shared.Models.Product>();
        foreach (var t in response.Product)
        {
            List<string> location = new List<string>();
            foreach (var s in t.Location)
            {
                location.Add(s);
            }
            var product = new Shared.Models.Product(t.Ean, t.ProductName, t.Stock, t.PhotoPath, location);
            products.Add(product);
        }
        return products;
    }

    public async Task<bool> UpdateStockOutgoingAsync(List<long> eans)
    {
        List<UpdateStock> toUpdate = new List<UpdateStock>();
        List<long> eansToRemove = new List<long>();
        foreach (var ean in eans)
        {
            if (!eansToRemove.Contains(ean))
            {
                int count = eans.Count(x => x.Equals(ean));
                UpdateStock update = new UpdateStock() { Ean = ean, Amount = -count };
                toUpdate.Add(update);
                eansToRemove.Add(ean);
            }
        }
        
        var response = await warehouseClient.updateStockMultipleAsync(new UpdateStockMultipleRequest(){Update = { toUpdate }});
        return response.Updated;
    }

    public async Task<bool> UpdateStockIngoingAsync(List<long> eans)
    {
        List<UpdateStock> toUpdate = new List<UpdateStock>();
        List<long> eansToRemove = new List<long>();
        foreach (var ean in eans)
        {
            if (!eansToRemove.Contains(ean))
            {
                int count = eans.Count(x => x.Equals(ean));
                UpdateStock update = new UpdateStock() { Ean = ean, Amount = count };
                toUpdate.Add(update);
                eansToRemove.Add(ean);
            }
        }
        var response = await warehouseClient.updateStockMultipleAsync(new UpdateStockMultipleRequest(){Update = { toUpdate }});
        return response.Updated;
    }

    public async Task<List<long>> RetrieveAllProductsEanAsync()
    {
        var response = await warehouseClient.retrieveAllProductsEanAsync(new RetrieveAllProductsEanRequest());
        var list = new List<long>();
        var repeatedField = response.Ean;
        foreach (var e in repeatedField)
        {
            list.Add(e);
        }
        return list;
    }

    public async Task<bool> RegisterLossAsync(Dictionary<long, int> dictionary)
    {
        RegisterLossResponse response = await warehouseClient.registerLossAsync(new RegisterLossRequest(){Loss = { dictionary }});
        return response.Registered;
    }
}