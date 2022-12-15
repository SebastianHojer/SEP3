using Shared.Models;

namespace WebAPI.Controllers;
using Application.LogicInterfaces;
using Microsoft.AspNetCore.Mvc;
using Shared.DTOs;


[ApiController]
[Route("[controller]")]
public class LossController : ControllerBase
{
    private readonly IWarehouseLogic warehouseLogic;

    public LossController(IWarehouseLogic warehouseLogic)
    {
        this.warehouseLogic = warehouseLogic;
    }

    [HttpGet]
    public async Task<ActionResult<List<Loss>>> RetrieveLoss(int caseId)
    {
        try
        {
            if (caseId == 0)
            {
                var loss = await warehouseLogic.RetrieveAllLossAsync();
                return Ok(loss);
            }
            else
            {
                var loss = await warehouseLogic.RetrieveLossAsync(caseId);
                List<Loss> losses = new List<Loss> { loss };
                return Ok(losses);
            }
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            throw;
        }
    }
    
    [HttpDelete]
    public async Task<ActionResult<Product>> DeleteAsync(int caseId)
    {
        try
        {
            await warehouseLogic.DeleteLossAsync(caseId);
            return Ok();
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

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

    
    [HttpPatch]
    public async Task<ActionResult> UpdateAsync(Loss loss)
    {
        Console.WriteLine("update in controller");
        await warehouseLogic.UpdateLossAsync(loss);
        return Ok();
    } 
}