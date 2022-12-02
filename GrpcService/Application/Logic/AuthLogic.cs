using System.ComponentModel.DataAnnotations;
using Application.LogicInterfaces;
using Shared.Models;

namespace Application.Logic;

public class AuthLogic : IAuthLogic
{
    private readonly IList<User> users = new List<User>
    {
        new User
        {
            Password = "1234",
            UserName = "Admin",
            IsAdmin = true
        },
        new User
        {
            Password = "1234",
            UserName = "NotAdmin",
            IsAdmin = false
        },
    };

    public Task<User> ValidateUser(string username, string password)
    {
        User? existingUser = users.FirstOrDefault(u => 
            u.UserName.Equals(username, StringComparison.OrdinalIgnoreCase));
        
        if (existingUser == null)
        {
            throw new Exception("User not found");
        }

        if (!existingUser.Password.Equals(password))
        {
            throw new Exception("Password mismatch");
        }

        return Task.FromResult(existingUser);
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
        
        users.Add(user);
        
        return Task.CompletedTask;
    }
}