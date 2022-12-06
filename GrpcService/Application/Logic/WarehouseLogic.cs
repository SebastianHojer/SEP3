using Application.DaoInterfaces;
using Application.LogicInterfaces;
using Shared.DTOs;
using Shared.Exceptions;
using Shared.Models;

namespace Application.Logic;

public class WarehouseLogic : IWarehouseLogic
{

    private readonly IWarehouseDao warehouseDao;

    public WarehouseLogic(IWarehouseDao warehouseDao)
    {
        this.warehouseDao = warehouseDao;
    }

    public async Task<Product> CreateAsync(ProductCreationDto productToCreate)
    {
        bool exists = await warehouseDao.ProductExistsAsync(productToCreate.ean);
        if (exists) throw new EanTakenException("EAN is already taken");
        ValidateData(productToCreate);
        Product toCreate = new Product(productToCreate.ean, productToCreate.productName, productToCreate.stock,
            productToCreate.information);
        Product created = await warehouseDao.CreateProductAsync(toCreate);
        return created;
    }
    
    private static void ValidateData(ProductCreationDto productToCreate)
    {

        if (productToCreate.ean.Length > 15)
            throw new InvalidProductException("EAN cannot be longer than 15 characters!");

        if (productToCreate.stock < 0)
        {
            throw new InvalidProductException("Stock cannot be lower than 0!");
        }

        if (productToCreate.information.Length > 100)
        {
            throw new InvalidProductException("Information cannot contain more than 100 characters");
        }

        if (productToCreate.productName.Length > 50)
        {
            throw new InvalidProductException("Product name cannot contain more than 50 characters");
        }
    }

    public async Task DeleteProductAsync(string ean)
    {
        if (!warehouseDao.ProductExistsAsync(ean).Result)
        {
            throw new Exception($"Product with EAN {ean} was not found!");
        }

        await warehouseDao.DeleteProductAsync(ean);
    }

    public async Task<List<Product>> RetrieveProducts()
    {
        List<Product> products = await warehouseDao.RetrieveProducts();
        return products;
    }
}