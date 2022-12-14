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
    public async Task<ActionResult<List<long>>> RetrieveStock()
    {
        var eans = await warehouseLogic.RetrieveAllProductsEanAsync();
        return Ok(eans);
    }
    
    [HttpPatch]
    public async Task<ActionResult> UpdateAsync(StockDto dto)
    {
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