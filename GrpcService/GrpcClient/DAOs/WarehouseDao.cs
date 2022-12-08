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

    public async Task<bool> ProductExistsAsync(string ean)
    {
        ProductExistsResponse response =
            await warehouseClient.productExistsAsync(new ProductExistsRequest() { Ean = ean });
        return response.Exists;
    }

    public async Task DeleteProductAsync(string ean)
    {
        await warehouseClient.deleteProductAsync(new DeleteProductRequest(){Ean = ean});
    }

    public async Task<Shared.Models.Product> RetrieveProductAsync(string ean)
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
}