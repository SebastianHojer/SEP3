using System.Collections;
using Application.DaoInterfaces;
using Shared.Models;

namespace GrpcClient.DAOs;

public class UserDao : IUserDao
{
    private readonly GrpcDao grpcDao;
    private User.UserClient userClient;

    public UserDao()
    {
        grpcDao = GrpcDao.Instance;
        userClient = grpcDao.getUserClient();
    }
    
    public async Task<Shared.Models.User> CreateUserAsync(Shared.Models.User user)
    {
        await userClient.createUserAsync(new UserCreationRequest(){ Admin = user.IsAdmin, Username = user.UserName, Password = user.Password });
        return user;
    }

    public async Task<List<string>> RetrieveUsersAsync()
    {
        var response = await userClient.retrieveUsersAsync(new UsernameRetrievalRequest());
        var usernames = new List<string>();
        foreach (var t in response.Username)
        {
            usernames.Add(t);
        }
        return usernames;
    }

    public async Task<bool> UsernameExistsAsync(string userName)
    {
        UsernameExistsResponse response = await userClient.usernameExistsAsync(new UsernameExistsRequest(){Username = userName});
        return response.Exists;
    }

    public async Task<Shared.Models.User> AuthenticatePasswordAsync(Shared.Models.User user)
    {
        PasswordAuthenticationResponse response = await userClient.authenticatePasswordAsync(new PasswordAuthenticationRequest(){Username = user.UserName, Password = user.Password});
        if (response.Authenticated)
        {
            user.Authenticated = true;
            if(response.IsAdmin){user.IsAdmin = true;}
        }
        return user;
    }

    public async Task DeleteUserAsync(string userName)
    {
        await userClient.deleteUserAsync(new DeleteUserRequest() { Username = userName });
    }
}