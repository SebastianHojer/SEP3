using System.Net;
using Microsoft.AspNetCore.Mvc;
using Shared.Models;

namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]

public class FileController : ControllerBase
{
    private readonly IWebHostEnvironment env;
    public FileController(IWebHostEnvironment env)
    {
        this.env = env;
    }

    [HttpPost]
    public async Task<ActionResult<List<UploadResult>>> UploadFile(List<IFormFile> files)
    {
        List<UploadResult> uploadResults = new List<UploadResult>();

        foreach (var file in files)
        {
            var uploadResult = new UploadResult();
            var untrustedFileName = file.FileName;
            uploadResult.FileName = untrustedFileName;

            var path = Path.Combine(env.ContentRootPath, "../BlazorWASM/wwwroot/Images", untrustedFileName);
            await using FileStream fs = new(path, FileMode.Create);
            await file.CopyToAsync(fs);

            uploadResult.StoredFileName = untrustedFileName;
            uploadResults.Add(uploadResult);
        }

        return Ok(uploadResults);
    }
}