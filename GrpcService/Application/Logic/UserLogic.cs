using Application.DaoInterfaces;
using Application.LogicInterfaces;
using Shared.DTOs;
using Shared.Exceptions;
using Shared.Models;

namespace Application.Logic;

public class UserLogic : IUserLogic
{
    private readonly IUserDao userDao;

    public UserLogic(IUserDao userDao)
    {
        this.userDao = userDao;
    }
    
    public async Task<User> CreateAsync(UserCreationDto dto)
    {
        bool exists = await userDao.UsernameExistsAsync(dto.UserName);
        if (exists)
            throw new UsernameTakenException("Username already taken!");

        ValidateData(dto);
        User toCreate = new User(dto.UserName, dto.Password, dto.IsAdmin);

        User created = await userDao.CreateUserAsync(toCreate);
    
        return created;
    }

    private static void ValidateData(UserCreationDto userToCreate)
    {
        string userName = userToCreate.UserName;

        if (userName.Length < 2)
            throw new InvalidUsernameException("Username minimum length is 2 characters!");

        if (userName.Length > 32)
            throw new InvalidUsernameException("Username max-length is 32 characters!");
    }

    public async Task DeleteUserAsync(string userName)
    {
        if (!userDao.UsernameExistsAsync(userName).Result)
        {
            throw new Exception($"User with username {userName} was not found!");
        }
        await userDao.DeleteUserAsync(userName);
    }

    public async Task<List<string>> RetrieveUsers()
    {
        List<string> usernames = await userDao.RetrieveUsersAsync();
        return usernames;
    }
}