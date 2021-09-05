package ch14code.t16;

import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;

// TCP 客户端
class client{
    private static final int port = 7788;
    public void connect() throws Exception {
        Socket s = new Socket(InetAddress.getLocalHost(),port);

        //接收数据
        InputStream inputStream = s.getInputStream();
        byte[] buf = new byte[1024];
        int len = inputStream.read(buf);
        System.out.println(new String(buf, 0, len));

        s.close();
    }
}

public class test1 {
    public static void main(String[] args) throws Exception {
        new client().connect();
    }
}
