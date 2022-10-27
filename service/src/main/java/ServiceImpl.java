import org.apache.thrift.TException;

import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.util.List;

public class ServiceImpl implements Service.Iface{
    @Override
    public boolean save(User user) throws TException {
        return false;
    }

    @Override
    public List<User> findUsersByName(String name) throws TException {
        return null;
    }

    @Override
    public void deleteByUserId(int userId) throws UserNotFoundException, TException {

    }

    @Override
    public boolean uploadFile(FileData filedata) throws TException {
        System.out.println("uploadFile function has been called.");

        // 写到文件
        String filePath = "D:\\项目\\myapp\\thrift\\2.jpg";
        try
        {
            java.io.File file = new java.io.File(filePath);
            FileOutputStream fos = new FileOutputStream(file);
            FileChannel channel = fos.getChannel();
            channel.write(filedata.buff);
            channel.close();
        }
        catch (Exception x)
        {
            x.printStackTrace();
            return false;
        }
        return true;

    }
}
