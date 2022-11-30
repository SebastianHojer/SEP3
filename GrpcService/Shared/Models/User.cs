namespace Shared.Models;

public class User
{
    public string UserName { get; set; } = null!;
    public string Password { get; set; } = null!;
    public bool IsAdmin { get; set; }
    
}