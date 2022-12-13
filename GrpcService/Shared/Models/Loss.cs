
namespace Shared.Models;

public class Loss
{
    public int CaseId { get; set; }
    public long Ean { get; set; }
    public string? Comment { get; set; }
    public bool Handled { get; set; }
    public int Amount { get; set; }

    public Loss(int caseId, long ean, string comment, bool handled, int amount)
    {
        CaseId = caseId;
        Ean = ean;
        Comment = comment;
        Handled = handled;
        Amount = amount;
    }

    public Loss(int caseId, long ean, int amount)
    {
        CaseId = caseId;
        Ean = ean;
        Amount = amount;
        Handled = false;
    }
}