namespace Shared.DTOs;

public class StockDto
{ 
    public List<long> eans;
    public string status;

    public StockDto(List<long> eans, string status)
    {
        this.eans = eans;
        this.status = status;
    }
}