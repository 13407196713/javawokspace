package ch20code.t1;

import javax.swing.*;
import java.awt.*;

public class test {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("拨号");
        // 网格包
        GridBagLayout gridBagLayout = new GridBagLayout();
        jFrame.setLayout(gridBagLayout); //使用 gridBagLayout布局管理器

        GridBagConstraints gridBagConstraints = new GridBagConstraints();

        gridBagConstraints.fill = GridBagConstraints.BOTH; //填充方式 : 横纵填充
        gridBagConstraints.weightx = 0.0; // 容器大小改变时，组件如何分配 默认为0， 0~1之间
        gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER; // 是将组建放在最后位置 = 结束行

        JTextField jTextField = new JTextField("13487490245");
        gridBagLayout.setConstraints(jTextField, gridBagConstraints);
        jFrame.add(jTextField);


        gridBagConstraints.weightx = 0.5; // 容器大小改变时，组件如何分配 默认为0， 0~1之间
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.gridwidth = 1;

        makebutton("7",jFrame, gridBagLayout,gridBagConstraints);
        makebutton("8",jFrame, gridBagLayout,gridBagConstraints);
        gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
        makebutton("9",jFrame, gridBagLayout,gridBagConstraints);
        gridBagConstraints.gridwidth = 1;

        makebutton("4",jFrame, gridBagLayout,gridBagConstraints);
        makebutton("5",jFrame, gridBagLayout,gridBagConstraints);
        gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
        makebutton("6",jFrame, gridBagLayout,gridBagConstraints);
        gridBagConstraints.gridwidth = 1;

        makebutton("1",jFrame, gridBagLayout,gridBagConstraints);
        makebutton("2",jFrame, gridBagLayout,gridBagConstraints);
        gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
        makebutton("3",jFrame, gridBagLayout,gridBagConstraints);
        gridBagConstraints.gridwidth = 1;

        makebutton("返回",jFrame, gridBagLayout,gridBagConstraints);
        gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
        makebutton("拨号",jFrame, gridBagLayout,gridBagConstraints);

        jFrame.setSize(400,450);
        jFrame.setVisible(true); // 可见
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void makebutton(String title, JFrame jFrame, GridBagLayout gridBagLayout, GridBagConstraints gridBagConstraints){
        JButton jButton = new JButton(title);
        gridBagLayout.setConstraints(jButton, gridBagConstraints);
        jFrame.add(jButton);
    }
}
