package ch14code.t18;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class test extends JPanel{
    public static void main(String[] args) {
        JFrame frame=new JFrame("我的电脑 - 属性");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new test(), BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }

    public test(){
        super(new GridLayout(1,1));
        // 创建空白的选项卡
        JTabbedPane tabbedPane=new JTabbedPane();
        // 指定选项卡使用的图片
        ImageIcon icon=createImageIcon("tab.jp1g");
        // 创建选项卡的内容面板
        JComponent panel1=makeTextPanel("计算机名qq");
        // 内容面板加进选项卡中
        tabbedPane.addTab("计算机名",icon, panel1,"Does nothing");
        // 快速访问符
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);

        JComponent panel2=makeTextPanel("硬件qq");
        tabbedPane.addTab("硬件",icon, panel2,"Does twice as much nothing");
        tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);

        JComponent panel3=makeTextPanel("高级qq");
        tabbedPane.addTab("高级",icon, panel3,"Still does nothing");
        tabbedPane.setMnemonicAt(2, KeyEvent.VK_3);

        JComponent panel4=makeTextPanel("系统qq");
        tabbedPane.addTab("系统",icon, panel4,"Does nothing at all");
        tabbedPane.setMnemonicAt(3, KeyEvent.VK_4);

        add(tabbedPane);
    }

    protected static ImageIcon createImageIcon(String path){
        java.net.URL imgURL = test.class.getResource(path);
        if(imgURL!=null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: "+path);
            return null;
        }
    }

    protected JComponent makeTextPanel(String text){
        JPanel panel=new JPanel(false);
        JLabel filler=new JLabel(text);
        filler.setHorizontalAlignment(JLabel.CENTER);
        panel.setLayout(new GridLayout(1,1));
        panel.add(filler);
        return panel;
    }
}
