package ch14code.t13;


import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class test {
    public static void main(String[] args) throws Exception {
        byte[] buf = new byte[1024];
        // 监听端口8954
        DatagramSocket ds = new DatagramSocket(8954);
        // 接收信息
        DatagramPacket dp = new DatagramPacket(buf,1024);

        System.out.println("等待接收信息...");
        ds.receive(dp);

        String str = new String(dp.getData(), 0, dp.getLength()) + " from " +dp.getAddress().getHostAddress() + ":" + dp.getPort();
        System.out.println(str);

        ds.close();
    }
}
