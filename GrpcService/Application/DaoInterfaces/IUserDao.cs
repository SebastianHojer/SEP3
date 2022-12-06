using Shared.Models;

namespace Application.DaoInterfaces;

public interface IUserDao
{
    Task<User> CreateUserAsync(User user);
    Task<bool> UsernameExistsAsync(string userName);
    Task<User> AuthenticatePasswordAsync(User user);
    Task DeleteUserAsync(string userName);
    Task<List<string>> RetrieveUsers();
}