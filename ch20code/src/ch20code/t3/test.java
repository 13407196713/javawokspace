package ch20code.t3;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class test extends JFrame {

    JPanel jp;
    JTable jTable = new JTable();

    public test(){
        // 数据模型
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowActivated(WindowEvent e) {
                do_this_windowActivated(e);
            }
        });

        setTitle("管理");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,300);

        jp = new JPanel();
        jp.setBorder(new EmptyBorder(5,5,5,5));
        jp.setLayout(new BorderLayout(0,0));
        setContentPane(jp);

        JPanel jPanel = new JPanel();
        jp.add(jPanel,BorderLayout.SOUTH);

        // 删除按钮
        JButton jButton = new JButton("删除");
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                do_button(e);
            }
        });
        jPanel.add(jButton);

        JScrollPane jScrollPane = new JScrollPane();
        jp.add(jScrollPane, BorderLayout.CENTER);
        // 添加表格
        jTable.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        // ListSelectionModel.SINGLE_INTERVAL_SELECTION 一次选择一个连续的索引范围

        jScrollPane.setViewportView(jTable);
    }

    // 向表格添加数据
    protected void do_this_windowActivated(WindowEvent e){
        // 表格模型
        DefaultTableModel defaultTableModel = new DefaultTableModel();
        defaultTableModel.setRowCount(0); // 清空数据
        //设置表头
        defaultTableModel.setColumnIdentifiers(new Object[]{"书名","出版社","出版时间","类别","价格"});
        //增加列内容
        defaultTableModel.addRow(new Object[]{"1","q","w","q","f"});
        defaultTableModel.addRow(new Object[]{"2","q","w","q","f"});
        defaultTableModel.addRow(new Object[]{"3","q","w","q","f"});
        defaultTableModel.addRow(new Object[]{"4","q","w","q","f"});
        defaultTableModel.addRow(new Object[]{"5","q","w","q","f"});
        defaultTableModel.setRowCount(30); // 设置行数

        jTable.setModel(defaultTableModel); // 应用表格模型
    }

    // 删除
    protected void do_button(ActionEvent e){
        DefaultTableModel defaultTableModel = (DefaultTableModel) jTable.getModel();

        int[] r = jTable.getSelectedRows();
        for(int i = 0; i < r.length; i++)
            defaultTableModel.removeRow(r[i]);

        jTable.setModel(defaultTableModel);
    }

    public static void main(String[] args) {
        new test();
    }
}
