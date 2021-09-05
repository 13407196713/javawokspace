package ch14code.t17;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("信息");
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new test().creatComponent());
        frame.pack(); // 调整此窗口的大小，以适合其子组件的首选大小和布局
        frame.setVisible(true);
    }

    private JPanel creatComponent(){
        JPanel jPanel = new JPanel();

        String t[][] = new String[3][];
        t[0]=new String[]{"w","l","h","a","s","d"};
        t[1]=new String[]{"w1","l1","h1","a1","s1","d1","e1"};
        t[2]=new String[]{"w2","l2","h2","a2","s2"};
        String grade[] = new String[]{"硕士","博士","博士后"};

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("教师学历信息");
        DefaultMutableTreeNode node = null;
        DefaultMutableTreeNode child = null;

        int length = 0;
        for (int i = 0;i < 3; i++){
            length = t[i].length;
            node = new DefaultMutableTreeNode(grade[i]);
            for (int j = 0; j < length; j++){
                child = new DefaultMutableTreeNode(t[i][j]);
                node.add(child);
            }
            root.add(node);
        }
        JTree jTree = new JTree(root);
        jPanel.add(jTree);
        jPanel.setVisible(true);
        return jPanel;
    }
}


