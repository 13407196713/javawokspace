package ch14code.t12;

import java.io.IOException;
import java.net.InetAddress;

public class test {
    public static void main(String[] args) throws IOException {
        InetAddress i1 = InetAddress.getLocalHost();
        System.out.println("本机ip = " + i1.getHostAddress());

        InetAddress i2 = InetAddress.getByName("www.baidu.com");
        System.out.println("baidu ip = " + i2.getHostAddress());
        System.out.println("3秒可达否？ " + i2.isReachable(3000));
        System.out.println("baidu 主机名 = " + i2.getHostName());
    }
}
