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
        bool exists = userDao.UsernameExists(dto.UserName).Result;
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

    public bool DeleteUser(string userName)
    {
        bool deleted = userDao.DeleteUser(userName).Result;
        return deleted;
    }

    public List<string> RetrieveUsers()
    {
        List<string> usernames = userDao.RetrieveUsers().Result;
        return usernames;
    }
}