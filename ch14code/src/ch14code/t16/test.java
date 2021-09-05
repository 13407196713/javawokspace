package ch14code.t16;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

// TCP服务端
class server{
    private static final int port = 7788;
    public void listen() throws Exception {
        ServerSocket ss = new ServerSocket(port);
        //接收数据
        Socket s = ss.accept();
        // 客户端输出流
        OutputStream os = s.getOutputStream();
        System.out.println("开始交流");
        os.write(("服务端欢迎你！").getBytes());
        Thread.sleep(1000);
        System.out.println("结束交流");
        os.close();
        s.close();
    }
}

public class test {
    public static void main(String[] args) throws Exception {
        new server().listen();
    }
}
