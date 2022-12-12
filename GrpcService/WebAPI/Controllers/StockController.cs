namespace WebAPI.Controllers;
using Application.LogicInterfaces;
using Microsoft.AspNetCore.Mvc;
using Shared.DTOs;
using Product = Shared.Models.Product;


[ApiController]
[Route("[controller]")]
public class StockController : ControllerBase
{
    private readonly IWarehouseLogic warehouseLogic;

    public StockController(IWarehouseLogic warehouseLogic)
    {
        this.warehouseLogic = warehouseLogic;
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
                List<Product> products = new List<Product>();
                products.Add(product);
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
    public async Task<ActionResult> UpdateAsync(StockDto dto)
    {
        Console.WriteLine(dto.status);
        if (dto.status.Equals("outgoing"))
            try
            {
                await warehouseLogic.UpdateStockOutgoingAsync(dto.eans);
                return Ok();
            }
            catch (Exception e)
            {
                Console.WriteLine(e);
                return StatusCode(500, e.Message);
            }
        else if (dto.status.Equals("ingoing"))
            try
            {
                await warehouseLogic.UpdateStockIngoingAsync(dto.eans);
                return Ok();
            }
            catch (Exception e)
            {
                Console.WriteLine(e);
                return StatusCode(500, e.Message);
            }
        else
        {
            return StatusCode(500, "string");
        }
    }
}