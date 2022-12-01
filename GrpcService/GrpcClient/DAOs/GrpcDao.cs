namespace GrpcClient.DAOs;
using Grpc.Net.Client;
using GrpcClient;

public sealed class GrpcDao
{
    private static readonly GrpcDao instance = new GrpcDao();
    private static User.UserClient userClient;

    static GrpcDao()
    {
        var channel = GrpcChannel.ForAddress("http://localhost:9090");
        AppContext.SetSwitch("System.Net.Http.SocketsHttpHandler.Http2UnencryptedSupport", true);
        userClient = new User.UserClient(channel);
    }

    private GrpcDao()
    {
        
    }
    
    public static GrpcDao Instance { get { return instance; } }

    public User.UserClient getUserClient()
    {
        return userClient;
    }
}