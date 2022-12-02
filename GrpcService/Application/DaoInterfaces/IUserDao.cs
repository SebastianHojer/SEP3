using Shared.Models;

namespace Application.DaoInterfaces;

public interface IUserDao
{
    Task<User> CreateUserAsync(User user);
    Task<bool> UsernameExists(string userName);
    Task<User> AuthenticatePassword(User user);
    Task<bool> DeleteUser(string userName);
    Task<List<string>> RetrieveUsers();
}