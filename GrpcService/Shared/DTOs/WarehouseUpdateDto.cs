namespace Shared.DTOs;

public class WarehouseUpdateDto
{
    public long Ean { get; set; }
    public string? ProductName { get; set; }
    public int? Stock { get; set; }
    public string? PhotoPath { get; set; }
    public IEnumerable<string>? locations { get; set; }

    public WarehouseUpdateDto(long ean)
    {
        Ean = ean;
    }
}