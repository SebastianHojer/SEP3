using System.ComponentModel.DataAnnotations;
using Application.DaoInterfaces;
using Application.LogicInterfaces;
using Shared.Models;

namespace Application.Logic;

public class AuthLogic : IAuthLogic
{
    private readonly IUserDao userDao;

    public AuthLogic(IUserDao userDao)
    {
        this.userDao = userDao;
    }

    public async Task<User> ValidateUser(string username, string password)
    {
        User user = new User(username, password);
        User authentication = await userDao.AuthenticatePasswordAsync(user);
        if (authentication.Authenticated == false)
        {
            throw new Exception("User or password is not found");
        }
        return user;
    }
}