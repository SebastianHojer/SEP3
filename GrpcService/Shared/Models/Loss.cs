
using System.Text.Json.Serialization;

namespace Shared.Models;

public class Loss
{
    public int CaseId { get; set; }
    public long Ean { get; set; }
    public bool Handled { get; set; }
    public int Amount { get; set; }

    [JsonConstructor]
    public Loss(int caseId, long ean, int amount, bool handled)
    {
        CaseId = caseId;
        Ean = ean;
        Amount = amount;
        Handled = handled;
    }
}