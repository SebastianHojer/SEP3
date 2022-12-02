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

    public Task<User> ValidateUser(string username, string password)
    {
        User user = new User(username, password);
        Console.WriteLine("AuthLogic");
        Task<bool> authentication = userDao.AuthenticatePassword(user);
        Console.WriteLine(authentication);
        if (authentication.Result == false)
        {
            throw new Exception("User or password is not found");
        }

        return Task.FromResult(user);
    }

    public Task RegisterUser(User user)
    {

        if (string.IsNullOrEmpty(user.UserName))
        {
            throw new ValidationException("Username cannot be null");
        }

        if (string.IsNullOrEmpty(user.Password))
        {
            throw new ValidationException("Password cannot be null");
        }
        // Do more user info validation here
        
        // save to persistence instead of list
        
        //users.Add(user);
        
        return Task.CompletedTask;
    }
}