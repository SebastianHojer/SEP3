namespace GrpcClient.DAOs;
using Grpc.Net.Client;
using GrpcClient;

public sealed class GrpcDao
{
    private static readonly GrpcDao instance = new GrpcDao();
    private static Lager.LagerClient client;

    static GrpcDao()
    {
        var channel = GrpcChannel.ForAddress("http://localhost:9090");
        AppContext.SetSwitch("System.Net.Http.SocketsHttpHandler.Http2UnencryptedSupport", true);
        client = new Lager.LagerClient(channel);
    }

    private GrpcDao()
    {
        
    }
    
    public static GrpcDao Instance { get { return instance; } }

    public Lager.LagerClient getClient()
    {
        return client;
    }
}