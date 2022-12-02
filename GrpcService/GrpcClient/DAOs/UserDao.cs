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
        userClient.createUserAsync(new UserCreationRequest(){ Admin = user.IsAdmin, Username = user.UserName, Password = user.Password });
        return await Task.FromResult(user);
    }

    public async Task<bool> UsernameExists(string userName)
    {
        UsernameExistsResponse response = userClient.usernameExistsAsync(new UsernameExistsRequest(){Username = userName}).ResponseAsync.Result;
        return await Task.FromResult(response.Exists);
    }

    public async Task<bool> AuthenticatePassword(Shared.Models.User user)
    {
        PasswordAuthenticationResponse response = userClient.authenticatePassword(new PasswordAuthenticationRequest(){Username = user.UserName, Password = user.Password});
        return await Task.FromResult(response.Authenticated);
    }

    public async Task<bool> DeleteUser(string userName)
    {
        DeleteUserResponse response = userClient.deleteUser(new DeleteUserRequest() { Username = userName });
        return await Task.FromResult(response.Deleted);
    }
}