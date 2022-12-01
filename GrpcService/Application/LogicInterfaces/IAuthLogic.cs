using Shared.Models;

namespace Application.LogicInterfaces;

public interface IAuthLogic
{
    Task RegisterUser(User user);
    Task<User> ValidateUser(string username, string password);
    
}