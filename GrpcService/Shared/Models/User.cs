using System.Text.Json.Serialization;

namespace Shared.Models;

public class User
{
    public string UserName { get; set; } = null!;
    public string Password { get; set; } = null!;
    public bool IsAdmin { get; set; }
    public bool Authenticated { get; set; }
    public User(string userName, string password)
    {
        UserName = userName;
        Password = password;
    }

    [JsonConstructor]
    public User(string userName, string password, bool isAdmin)
    {
        UserName = userName;
        Password = password;
        IsAdmin = isAdmin;
    }
}