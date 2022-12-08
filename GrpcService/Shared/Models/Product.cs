using System.Text.Json.Serialization;

namespace Shared.Models;

public class Product
{
    public string Ean { get; set; }
    public string ProductName { get; set; }
    public int Stock { get; set; }
    public string? Information { get; set; }

    public Product(string ean, string productName)
    {
        Ean = ean;
        ProductName = productName;
    }
    [JsonConstructor]
    public Product(string ean, string productName, int stock, string information)
    {
        Ean = ean;
        ProductName = productName;
        Stock = stock;
        Information = information;
    }
}