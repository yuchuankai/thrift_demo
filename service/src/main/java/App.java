import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadedSelectorServer;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TNonblockingServerSocket;
import org.apache.thrift.transport.TNonblockingServerTransport;
import org.apache.thrift.transport.TTransportFactory;

public class App {

    private static final int SERVER_PORT = 9123;

    public static void main(String[] args)
    {
        try
        {
            // 创建非阻塞的 Transport
            TNonblockingServerTransport serverSocket = new TNonblockingServerSocket(SERVER_PORT);

            // 创建 Processor
            TProcessor processor = new Service.Processor(new ServiceImpl());

            // 创建 transport factory , Nonblocking 使用 TFramedTransport
            TTransportFactory transportFactory = new TFramedTransport.Factory();

            // 创建 protocol factory
            TBinaryProtocol.Factory protocolFactory = new TBinaryProtocol.Factory();

            // 创建 arguments
            TThreadedSelectorServer.Args tArgs = new TThreadedSelectorServer.Args(serverSocket);
            tArgs.processor(processor);
            tArgs.transportFactory(transportFactory);
            tArgs.protocolFactory(protocolFactory);

            // 创建 server
            TServer server = new TThreadedSelectorServer(tArgs);

            // 启动 server
            server.serve();
        }
        catch (Exception x)
        {
            x.printStackTrace();
        }
    }

}
