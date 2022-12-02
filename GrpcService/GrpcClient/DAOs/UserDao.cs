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

    public async Task<bool> UsernameExists(string userName)
    {
        UsernameExistsResponse response = await userClient.usernameExistsAsync(new UsernameExistsRequest(){Username = userName});
        return response.Exists;
    }

    public async Task<Shared.Models.User> AuthenticatePassword(Shared.Models.User user)
    {
        PasswordAuthenticationResponse response = await userClient.authenticatePasswordAsync(new PasswordAuthenticationRequest(){Username = user.UserName, Password = user.Password});
        if (response.Authenticated)
        {
            user.Authenticated = true;
            if(response.IsAdmin){user.IsAdmin = true;}
        }
        
        return user;
    }

    public async Task<bool> DeleteUser(string userName)
    {
        DeleteUserResponse response = await userClient.deleteUserAsync(new DeleteUserRequest() { Username = userName });
        return  response.Deleted;
    }
}