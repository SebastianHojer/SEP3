using System.Text.Json.Serialization;

namespace Shared.DTOs;

public class StockDto
{ 
    public List<long> eans { get; set; }
    public string status { get; set; }

    [JsonConstructor]
    public StockDto(List<long> eans, string status)
    {
        this.eans = eans;
        this.status = status;
    }
}