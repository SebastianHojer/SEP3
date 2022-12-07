using Application.LogicInterfaces;
using Microsoft.AspNetCore.Mvc;
using Shared.DTOs;
using Shared.Exceptions;
using Product = Shared.Models.Product;

namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]
public class WarehouseController : ControllerBase
{
    private readonly IWarehouseLogic warehouseLogic;

    public WarehouseController(IWarehouseLogic warehouseLogic)
    {
        this.warehouseLogic = warehouseLogic;
    }
    
    [HttpPost]
    public async Task<ActionResult<Product>> CreateAsync(ProductCreationDto dto)
    {
        try
        {
            Product product = await warehouseLogic.CreateAsync(dto);
            return Created($"/warehouse/{product.Ean}", product);
        }
        catch(InvalidUsernameException e)
        {
            return StatusCode(400, e.Message);
        }
        catch (Exception e)
        {
            return StatusCode(500, e.Message);
        }
    }
    [HttpDelete]
    public async Task<ActionResult<Product>> DeleteAsync(Product product)
    {
        try
        {
            await warehouseLogic.DeleteProductAsync(product.Ean);
            return Ok(product);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpGet]
    public async Task<ActionResult<IEnumerable<Product>>> RetrieveProductsAsync()
    {
        try
        {
            IEnumerable<Product> products = await warehouseLogic.RetrieveProductsAsync();
            return Ok(products);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            throw;
        }
    }
}