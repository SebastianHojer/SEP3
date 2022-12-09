namespace Shared.DTOs;

public class ProductCreationDto
{
    public long Ean { get; set; }
    public string ProductName { get; set; }
    public int Stock { get; set; }
    public string PhotoPath { get; set; }
    public IEnumerable<string> Location { get; set; }

    public ProductCreationDto(long ean, string productName, int stock, string photoPath, IEnumerable<string> location)
    {
        Ean = ean;
        ProductName = productName;
        Stock = stock;
        PhotoPath = photoPath;
        Location = location;
    }
}