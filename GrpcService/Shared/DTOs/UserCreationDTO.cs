namespace Shared.DTOs;

public class UserCreationDto
{
    public string UserName {get;}
    public string Password { get; }
    
    public bool IsAdmin { get; }

    public UserCreationDto(string userName, string password, bool isAdmin)
    {
        UserName = userName;
        Password = password;
        IsAdmin = isAdmin;
    }
}