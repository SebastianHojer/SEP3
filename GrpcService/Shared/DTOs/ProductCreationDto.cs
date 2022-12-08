namespace Shared.DTOs;

public class ProductCreationDto
{
    public string Ean { get; set; }
    public string ProductName { get; set; }
    public int Stock { get; set; }
    public string PhotoPath { get; set; }
    public List<string> Location { get; set; }

    public ProductCreationDto(string ean, string productName, int stock, string photoPath, List<string> location)
    {
        Ean = ean;
        ProductName = productName;
        Stock = stock;
        PhotoPath = photoPath;
        Location = location;
    }
}