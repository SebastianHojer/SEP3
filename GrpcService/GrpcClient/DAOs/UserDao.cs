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
    
    public Task<Shared.Models.User> CreateUserAsync(Shared.Models.User user)
    {
        userClient.createUserAsync(new UserCreationRequest(){ Admin = user.IsAdmin, Username = user.UserName, Password = user.Password });
        return Task.FromResult(user);
    }

    public Task<bool> UsernameExists(string userName)
    {
        UsernameExistsResponse response = userClient.usernameExistsAsync(new UsernameExistsRequest(){Username = userName}).ResponseAsync.Result;
        return Task.FromResult(response.Exists);
    }
}