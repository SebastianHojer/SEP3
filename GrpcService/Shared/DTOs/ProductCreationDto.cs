namespace Shared.DTOs;

public class ProductCreationDto
{
    public string ean { get; set; }
    public string productName { get; set; }
    public int stock { get; set; }
    public string information { get; set; }

    public ProductCreationDto(string ean, string productName, int stock, string information)
    {
        this.ean = ean;
        this.productName = productName;
        this.stock = stock;
        this.information = information;
    }
}