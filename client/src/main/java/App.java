import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;

public class App {
    public static void main(String[] args) {
        // 测试文件路径
        String filePath = "C:\\Users\\yuchuankai\\Pictures\\联想锁屏壁纸\\8612667.jpg";

        // 构造文件数据
        byte[] bytes = toByteArray(filePath);
        FileData fileData = new FileData();
        fileData.name = filePath;
        fileData.buff = ByteBuffer.wrap(bytes);

        // 构造Thrift客户端，发起请求
        try
        {
            TSocket socket = new TSocket("localhost", 12345);
            socket.setSocketTimeout(60 * 1000);
            TFramedTransport framedTransport = new TFramedTransport(socket);
            framedTransport.open();
            TBinaryProtocol binaryProtocol = new TBinaryProtocol(framedTransport);
            Service.Client client = new Service.Client(binaryProtocol);
            client.uploadFile(fileData);
        }
        catch (Exception x)
        {
            x.printStackTrace();
        }

    }
    private static byte[] toByteArray(String filePath) {
        byte[] buffer = null;
        try {
            File file = new File(filePath);
            FileInputStream fis = new FileInputStream(file);
            ByteArrayOutputStream bos = new ByteArrayOutputStream(1000);
            byte[] b = new byte[1000];
            int n;
            while ((n = fis.read(b)) != -1) {
                bos.write(b, 0, n);
            }
            fis.close();
            bos.close();
            buffer = bos.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return buffer;
    }
}
