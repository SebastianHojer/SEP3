using Application.LogicInterfaces;
using Microsoft.AspNetCore.Mvc;
using Shared.DTOs;
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
        catch (Exception e)
        {
            return StatusCode(500, e.Message);
        }
    }
    
    [HttpDelete]
    public async Task<ActionResult<Product>> DeleteAsync(long ean)
    {
        try
        {
            await warehouseLogic.DeleteProductAsync(ean);
            return Ok();
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpGet]
    public async Task<ActionResult<List<Product>>> RetrieveProductsAsync([FromQuery]long ean)
    {
        try
        {
            if (ean==0)
            {
                List<Product> products = await warehouseLogic.RetrieveProductsAsync();
                return Ok(products); 
            }
            else
            {
                Product product = await warehouseLogic.RetrieveProductAsync(ean);
                List<Product> products = new List<Product> { product };
                return Ok(products);
            }
           
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            throw;
        }
    }
    [HttpPatch]
    public async Task<ActionResult> UpdateAsync(WarehouseUpdateDto dto)
    {
        try
        {
            await warehouseLogic.UpdateAsync(dto);
            return Ok();
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
}