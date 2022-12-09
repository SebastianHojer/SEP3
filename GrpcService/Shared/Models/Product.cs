using System.Text.Json.Serialization;

namespace Shared.Models;

public class Product
{
    public long Ean { get; set; }
    public string ProductName { get; set; }
    public int Stock { get; set; }
    public string PhotoPath { get; set; }
    public IEnumerable<string> Location { get; set; }

    public Product(long ean, string productName)
    {
        Ean = ean;
        ProductName = productName;
        Location = new List<string>();
    }
    [JsonConstructor]
    public Product(long ean, string productName, int stock, string photoPath, IEnumerable<string> location)
    {
        Ean = ean;
        ProductName = productName;
        Stock = stock;
        PhotoPath = photoPath;
        Location = location;
    }
}