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
        var productToUpdate = new Product(){Ean = product.Ean, Stock = product.Stock, PhotoPath = product.PhotoPath, Location = { product.Location }, ProductName = product.ProductName};
        var response = await warehouseClient.updateProductAsync(new UpdateProductRequest() { Product = productToUpdate });
        return response.Updated;
    }

    public async Task<List<Shared.Models.Product>> RetrieveProductsAsync()
    {
        var response = await warehouseClient.retrieveProductsAsync(new RetrieveProductsRequest());
        var products = new List<Shared.Models.Product>();
        foreach (var t in response.Product)
        {
            var location = new List<string>();
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
        var toUpdate = new List<UpdateStock>();
        var eansToRemove = new List<long>();
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
        var toUpdate = new List<UpdateStock>();
        var eansToRemove = new List<long>();
        foreach (var ean in eans)
        {
            if (!eansToRemove.Contains(ean))
            {
                var count = eans.Count(x => x.Equals(ean));
                var update = new UpdateStock() { Ean = ean, Amount = count };
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
        foreach (var e in response.Ean)
        {
            list.Add(e);
        }
        return list;
    }

    public async Task<bool> RegisterLossAsync(Dictionary<long, int> dictionary)
    {
        var response = await warehouseClient.registerLossAsync(new RegisterLossRequest(){Loss = { dictionary }});
        return response.Registered;
    }

    public async Task<Shared.Models.Loss> RetrieveLossAsync(int caseId)
    {
        var response = await warehouseClient.retrieveLossAsync(new RetrieveLossRequest(){CaseId = caseId});
        var fromResponse = response.Loss;
        var lossToReturn = new Shared.Models.Loss(fromResponse.CaseId, fromResponse.Ean,
             fromResponse.Amount, fromResponse.Handled);
        return lossToReturn;
    }

    public async Task<List<Shared.Models.Loss>> RetrieveAllLossAsync()
    {
        var response = await warehouseClient.retrieveAllLossAsync(new RetrieveAllLossRequest());
        var lossList = new List<Shared.Models.Loss>();
        foreach (var loss in response.Loss)
        {
            lossList.Add(new Shared.Models.Loss(loss.CaseId, loss.Ean, loss.Amount, loss.Handled));
        }
        return lossList;
    }

    public async Task<bool> UpdateLossAsync(Shared.Models.Loss loss)
    {
        Loss grpcLoss = new Loss()
            { Amount = loss.Amount, CaseId = loss.CaseId, Ean = loss.Ean, Handled = loss.Handled };
        
        var response = await warehouseClient.updateLossAsync(new UpdateLossRequest()
        { Loss = grpcLoss });
        return response.Updated;
    }

    public async Task DeleteLossAsync(int caseId)
    {
        var response = await warehouseClient.deleteLossAsync(new DeleteLossRequest() { CaseId = caseId });
    }
}