package ch14code.t14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.*;

class guichat extends JFrame{
    private static final int Port = 8899;

    //把主窗口分为 NORTH CEMTER 和 SouTH 三个部分
    private JLabel stateLB;           //显示监听状态
    private JTextArea centerTextArea; //显示聊天记录
    private JTextArea inputTextArea;  //聊天输入框

    private JPanel bottomPanel;       //放置 IP输入框,按钮等
    private JTextField ipTextField;   //IP 输入框
    private JTextField remotePortTF;  //端口号输入框
    private JButton sendBT;           //发送按钮
    private JButton clearBT;          //清除聊天记录按钮

    private JPanel southPanel;        //最下面的面板

    private DatagramSocket datagramSocket; //用于后面功能的实现

    // 初始化界面
    private void UI(){
        setTitle("gui 聊天");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400); //设置窗口的大小
        setResizable(true); //窗口大小可调整
        setLocationRelativeTo(null); //窗口居中

        //窗口的 NORTH 部分
        stateLB = new JLabel("当前还未启动监听");
        stateLB.setHorizontalAlignment(JLabel.RIGHT); //设置水平对齐方式

        // 窗口的 CENTER 部分
        centerTextArea = new JTextArea(); //聊天记录显示区域
        centerTextArea.setEditable(false);  // 控件不能被编辑
        centerTextArea.setBackground(new Color(211,211,211));

        //窗口的 South部分
        southPanel = new JPanel(new BorderLayout());
        inputTextArea = new JTextArea(5,20); //内容输人区域
        southPanel.add(new JScrollPane(inputTextArea),BorderLayout.CENTER);

        bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,5,5));
        ipTextField = new JTextField("127.0.0.1",8); // 8 是背景显示长度
        remotePortTF = new JTextField(String.valueOf(Port),3);
        sendBT=new JButton("发送");
        clearBT=new JButton("清屏");

        bottomPanel.add(ipTextField);
        bottomPanel.add(remotePortTF);
        bottomPanel.add(sendBT);
        bottomPanel.add(clearBT);

        southPanel.add(bottomPanel,BorderLayout.SOUTH);

        //添加窗口 NORTH、CENTER,SOUTH 部分的组件
        add(stateLB,BorderLayout.NORTH);
        add(new JScrollPane(centerTextArea),BorderLayout.CENTER);
        add(southPanel,BorderLayout.SOUTH);
        setVisible(true);
    }

    private void initSocket(){
        int port = Port;
        while (true){
            try {
                if(datagramSocket != null && !datagramSocket.isClosed()){
                    datagramSocket.close();
                }

                try {
                    port = Integer.parseInt(JOptionPane.showInputDialog(this, "请输入端口号", "端口号", JOptionPane.QUESTION_MESSAGE));
                    if (port<1 || port>65535){
                        throw new Exception("端口号越界！");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,"端口不正确！重新输入！");
                    continue;
                }

                // 启动 DatagramSocket
                datagramSocket = new DatagramSocket(port);
                //接收信息
                startListen();
                stateLB.setText("已在" + port + "监听");
                break;
            } catch (SocketException e) {
                JOptionPane.showMessageDialog(this, "端口已经被占用，请重新填写！");
                stateLB.setText("未启动监听！");
            }
        }
    }

    private void startListen(){
        new Thread(){
            private DatagramPacket dp;

            public void run(){
                byte[] buf = new byte[1024];
                dp = new DatagramPacket(buf, buf.length);

                while(!datagramSocket.isClosed()){
                    try{
                        datagramSocket.receive(dp);
                        centerTextArea.append(dp.getAddress().getHostAddress() + ":" + ((InetSocketAddress)dp.getSocketAddress()).getPort() + "对我说：\n" + new String(dp.getData(), 0, dp.getLength()) + "\n\n");

                        // 滚落条自动滚到最底端
                        centerTextArea.setCaretPosition(centerTextArea.getText().length());

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }

    private void setListenerr(){
        // 监听 sendBT
        sendBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //获取发送的目标ip与端口号
                final String ipAddress = ipTextField.getText();
                final String remotePort = remotePortTF.getText();

                //判断 IP 地址和端口号是否为空
                if (ipAddress==null || ipAddress.trim().equals("") || remotePort==null || remotePort.trim().equals("")){
                    return;
                }

                if (datagramSocket==null || datagramSocket.isClosed()){
                    JOptionPane.showMessageDialog(guichat.this,"监听不成功");
                    return;
                }

                //获得需要发送的内容
                String sendContent = inputTextArea.getText();
                byte[] buf = sendContent.getBytes();
                try {
                    //将发送的内容显示在自己的聊天记录中
                    centerTextArea.append("我对" + ipAddress + ":" + remotePort + "说：\n" + inputTextArea.getText()+"\n\n");
                    //添加内容后,使滚动条自动滚动到最底端
                    centerTextArea.setCaretPosition(centerTextArea.getText().length());

                    //发送数据
                    datagramSocket.send(new DatagramPacket(buf,buf.length, InetAddress.getByName(ipAddress),Integer.parseInt(remotePort)) );
                    inputTextArea.setText("");
                } catch (UnknownHostException unknownHostException) {
                    unknownHostException.printStackTrace();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

            }
        });

        // 监听 clearBT
        clearBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                centerTextArea.setText("");
            }
        });

        }

    public guichat(){
        UI();
        initSocket();
        setListenerr();
    }
}

public class test {
    public static void main(String[] args) {
        new guichat();
    }
}
