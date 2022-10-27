import org.apache.thrift.TException;

import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.List;

public class ServiceImpl implements Service.Iface{
    @Override
    public boolean save(User user) throws TException {
        System.out.println("方法save的参数user的内容==>" + user.toString());
        return true;
    }

    @Override
    public List<User> findUsersByName(String name) throws TException {
        System.out.println("方法findUsersByName的参数name的内容==>" + name);
        return Arrays.asList(new User(1, "lili"), new User(2, "lila"));
    }

    @Override
    public void deleteByUserId(int userId) throws UserNotFoundException, TException {
        /*
         * 直接模拟抛出异常，用于测试
         */
        System.out.println("方法deleteByUserId的参数userId的内容==>" + userId);
        throw new UserNotFoundException("1001", String.format("userId=%d的用户不存在", userId));
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
