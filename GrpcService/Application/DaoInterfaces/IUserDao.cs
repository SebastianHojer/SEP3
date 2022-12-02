using Shared.Models;

namespace Application.DaoInterfaces;

public interface IUserDao
{
    Task<User> CreateUserAsync(User user);
    Task<bool> UsernameExists(string userName);
    Task<bool> AuthenticatePassword(User user);
}