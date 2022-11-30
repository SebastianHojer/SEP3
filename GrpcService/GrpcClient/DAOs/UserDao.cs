﻿using Application.DaoInterfaces;
using Shared.Models;

namespace GrpcClient.DAOs;

public class UserDao : IUserDao
{
    private readonly GrpcDao grpcDao;
    private User.UserClient client;
    
    public UserDao()
    {
        grpcDao = GrpcDao.Instance;
        client = grpcDao.getClient();
    }
    
    public Task<Shared.Models.User> CreateAsync(Shared.Models.User user)
    {
        client.createUserAsync(new UserCreationRequest(){ Admin = user.IsAdmin, Username = user.UserName, Password = user.Password });
        return Task.FromResult(user);
    }

    public Task<bool> UsernameExists(string userName)
    {
        UsernameExistsResponse response = client.usernameExistsAsync(new UsernameExistsRequest(){Username = userName}).ResponseAsync.Result;
        return Task.FromResult(response.Exists);
    }
}