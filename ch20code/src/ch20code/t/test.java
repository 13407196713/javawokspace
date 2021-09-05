package ch20code.t;

import javax.swing.*;
import java.awt.*;

public class test {
    public static void main(String[] args) {
        JFrame jf = new JFrame("网式布局");
        JPanel jp = new JPanel(); // 面板
        // 4行 4列 间隙为5
        GridLayout g = new GridLayout(4,4,5,5);
        jp.setLayout(g);

        char[] s = new char[]{'7','8','9','/','4','5','6','*','1','2','3','-','0','.','=','+'};
        for (char t:s){
            jp.add(new JButton(String.valueOf(t)));
        }

        jf.add(jp);
        jf.setSize(400,500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
