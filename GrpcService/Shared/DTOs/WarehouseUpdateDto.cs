namespace Shared.DTOs;

public class WarehouseUpdateDto
{
    public string Ean { get; set; }
    public string? ProductName { get; set; }
    public int? Stock { get; set; }
    public string? PhotoPath { get; set; }

    public WarehouseUpdateDto(string ean)
    {
        Ean = ean;
    }
}