using Shared.Models;

namespace WebAPI.Controllers;
using Application.LogicInterfaces;
using Microsoft.AspNetCore.Mvc;
using Shared.DTOs;
using Product = Shared.Models.Product;


[ApiController]
[Route("[controller]")]
public class LossController : ControllerBase
{
    private readonly IWarehouseLogic warehouseLogic;

    public LossController(IWarehouseLogic warehouseLogic)
    {
        this.warehouseLogic = warehouseLogic;
    }

    /*[HttpGet]
    public async Task<ActionResult<List<Loss>>> RetrieveLoss()
    {
        var loss = await warehouseLogic.RetrieveLossAsync();
        return Ok(eans);
    } */

    [HttpPost]
    public async Task<ActionResult> RegisterLoss(Dictionary<long, int> dictionary)
    {
        try
        {
            bool registered = await warehouseLogic.RegisterLoss(dictionary);
            return Created("/loss", registered);
        }
        catch (Exception e)
        {
            return StatusCode(500, e.Message);
        }
    }

    /*
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
    } */
}