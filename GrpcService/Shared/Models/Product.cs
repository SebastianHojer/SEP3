using System.Text.Json.Serialization;

namespace Shared.Models;

public class Product
{
    public string Ean { get; set; }
    public string ProductName { get; set; }
    public int Stock { get; set; }
    public string? PhotoPath { get; set; }
    public IEnumerable<string> Location { get; set; }

    public Product(string ean, string productName)
    {
        Ean = ean;
        ProductName = productName;
    }
    [JsonConstructor]
    public Product(string ean, string productName, int stock, string photoPath, IEnumerable<string> location)
    {
        Ean = ean;
        ProductName = productName;
        Stock = stock;
        PhotoPath = photoPath;
        Location = location;
    }
}