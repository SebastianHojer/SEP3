namespace Shared.DTOs;

public class ProductCreationDto
{
    public string Ean { get; set; }
    public string ProductName { get; set; }
    public int Stock { get; set; }
    public string Information { get; set; }

    public ProductCreationDto(string ean, string productName, int stock, string information)
    {
        Ean = ean;
        ProductName = productName;
        Stock = stock;
        Information = information;
    }
}