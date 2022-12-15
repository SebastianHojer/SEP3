using Application.DaoInterfaces;
using Application.Logic;
using Application.LogicInterfaces;
using GrpcClient.DAOs;
using Shared.DTOs;
using Shared.Exceptions;
using Xunit;

namespace Tests;

public class UnitTestUserLogic
{
    [Fact]
    public void FailingTestUsernameTooShort()
    {
        UserCreationDto dto = new UserCreationDto("b", "pass", false);
        Assert.Throws(typeof(InvalidUsernameException), () => UserLogic.ValidateData(dto));
    }
    
    [Fact]
    public void FailingTestUsernameTooLong()
    {
        UserCreationDto dto = new UserCreationDto("bokoegkaogkeoakgoakegojaoegjoaejgoaejgojeaog", "pass", false);
        Assert.Throws(typeof(InvalidUsernameException), () => UserLogic.ValidateData(dto));
    }

    [Fact]
    public void PassingTestUsername()
    {
        UserCreationDto dto = new UserCreationDto("Username", "password", false);
        Assert.True(UserLogic.ValidateData(dto));
    }
}