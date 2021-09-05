package ch14code.t13;

import java.net.*;

public class test1 {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();

        // 发送信息
        String str = new String("你好");

        DatagramPacket dp = new DatagramPacket(str.getBytes(), str.getBytes().length, InetAddress.getByName("localhost"), 8954);

        System.out.println("发送信息");
        ds.send(dp);
        ds.close();
    }
}
