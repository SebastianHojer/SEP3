using Application.DaoInterfaces;
using Application.Logic;
using Application.LogicInterfaces;
using GrpcClient.DAOs;
using Shared.DTOs;
using Shared.Exceptions;
using Xunit;

namespace Tests;

public class UnitTestLogic
{
    [Fact]
    public void FailingTestEan()
    {
        ProductCreationDto dto = new ProductCreationDto(-1, "", 0, "", null);
        Assert.Throws(typeof(InvalidProductException), (() => WarehouseLogic.ValidateData(dto)));
    }

    [Fact]
    public void PassingTestEan()
    {
        ProductCreationDto dto = new ProductCreationDto(759389358, "", 0, "", null);
        Assert.True(WarehouseLogic.ValidateData(dto));
    }
    
    [Fact]
    public void FailingTestProductName()
    {
        ProductCreationDto dto = new ProductCreationDto(1, "ijkejkskalfkeurnaisjfkansetiskqowpslfuerauwkmvieurq", 0, "", null);
        Assert.Throws(typeof(InvalidProductException), (() => WarehouseLogic.ValidateData(dto)));
    }

    [Fact]
    public void PassingTestProductName()
    {
        ProductCreationDto dto = new ProductCreationDto(759389358, "product", 0, "", null);
        Assert.True(WarehouseLogic.ValidateData(dto));
    }
    
    [Fact]
    public void FailingTestPhotoPath()
    {
        ProductCreationDto dto = new ProductCreationDto(1, "", 0, "ijkejkskalfkeurnaisjfkansetiskqowpslfuerauwkmvieurqijkejkskalfkeurnaisjfkansetiskqowpslfuerauwkmvieurq", null);
        Assert.Throws(typeof(InvalidProductException), (() => WarehouseLogic.ValidateData(dto)));
    }

    [Fact]
    public void PassingTestPhotoPath()
    {
        ProductCreationDto dto = new ProductCreationDto(759389358, "product", 0, "src/image.png", null);
        Assert.True(WarehouseLogic.ValidateData(dto));
    }
    
    [Fact]
    public void FailingTestStock()
    {
        ProductCreationDto dto = new ProductCreationDto(-1, "product", -5, "src/image.png", null);
        Assert.Throws(typeof(InvalidProductException), (() => WarehouseLogic.ValidateData(dto)));
    }

    [Fact]
    public void PassingTestStock()
    {
        ProductCreationDto dto = new ProductCreationDto(759389358, "product", 5, "src/image.png", null);
        Assert.True(WarehouseLogic.ValidateData(dto));
    }
}