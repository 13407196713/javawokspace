package ch20code.t2;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("成绩表");
        jFrame.setSize(600,300);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Random rand = new Random();
        DecimalFormat df =new DecimalFormat("#0.0");
        Object[][] data = new Object[5][8];
        for (int i = 0; i<5 ;i++){
            data[i][0] = ("1000" + (i+1));
            for (int j = 1; j<6; j++){
                double d = rand.nextDouble()*50 + 50;
                data[i][j] = Double.parseDouble(df.format(d));
            }
            double t = 0;
            for (int k = 1; k<6; k++){
                t += (double)data[i][k];
            }
            data[i][6] = df.format(t);
            data[i][7] = df.format(t/5);
        }

        String[] name = {"1学号","2软件工程","3java","4c++","5网络","6数据结构","7总成绩","8平均成绩"};

        JTable jTable = new JTable(data,name);
        Container container = jFrame.getContentPane();
        container.add(new JScrollPane(jTable));

        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
