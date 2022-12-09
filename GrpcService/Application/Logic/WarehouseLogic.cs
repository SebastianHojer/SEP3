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
        bool exists = await warehouseDao.ProductExistsAsync(productToCreate.Ean);
        if (exists) throw new EanTakenException("EAN is already taken");
        ValidateData(productToCreate);
        Product toCreate = new Product(productToCreate.Ean, productToCreate.ProductName, productToCreate.Stock,
            productToCreate.PhotoPath, productToCreate.Location);
        Product created = await warehouseDao.CreateProductAsync(toCreate);
        return created;
    }

    private static void ValidateData(ProductCreationDto productToCreate)
    {

        if (productToCreate.Ean.Length > 15)
            throw new InvalidProductException("EAN cannot be longer than 15 characters!");

        if (productToCreate.Stock < 0)
        {
            throw new InvalidProductException("Stock cannot be lower than 0!");
        }

        if (productToCreate.PhotoPath.Length > 100)
        {
            throw new InvalidProductException("Information cannot contain more than 100 characters");
        }

        if (productToCreate.ProductName.Length > 50)
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

    public async Task<Product> RetrieveProductAsync(string ean)
    {
        Product product = await warehouseDao.RetrieveProductAsync(ean);
        return product;
    }

    public async Task<List<Product>> RetrieveProductsAsync()
    {
        List<Product> products = await warehouseDao.RetrieveProductsAsync();
        return products;
    }

    public async Task<bool> UpdateAsync(WarehouseUpdateDto dto)
    {
        Product? existing = await warehouseDao.RetrieveProductAsync(dto.Ean);
        if (existing == null)
        {
            throw new Exception($"Product with EAN: {dto.Ean} not found!");
        }

        string productName = dto.ProductName ?? existing.ProductName;
        int stockToUse = dto.Stock ?? existing.Stock;
        string photoPath = dto.PhotoPath ?? existing.PhotoPath;
        List<string> location = null;

        ProductCreationDto updated = new(existing.Ean, productName, stockToUse, photoPath, location);

        ValidateData(updated);

        Product updatedProduct = new Product(updated.Ean, updated.ProductName, updated.Stock, updated.PhotoPath,
            updated.Location);

        return await warehouseDao.UpdateAsync(updatedProduct);
    }

    public async Task<bool> UpdateStockIngoingAsync(List<string> eans)
    {
        return await warehouseDao.UpdateStockIngoingAsync(eans);
    }

    public async Task<bool> UpdateStockOutgoingAsync(List<string> eans)
    {
        return await warehouseDao.UpdateStockOutgoingAsync(eans);
    }
}
