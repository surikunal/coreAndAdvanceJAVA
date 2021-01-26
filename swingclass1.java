// ================ JTREE ============================

// import javax.swing.*;
// import javax.swing.tree.DefaultMutableTreeNode;

// public class swingclass1 {
//     swingclass1() {
//         JFrame frame = new JFrame("example");

//         DefaultMutableTreeNode style = new DefaultMutableTreeNode("style");
//         DefaultMutableTreeNode color = new DefaultMutableTreeNode("color");
//         DefaultMutableTreeNode font = new DefaultMutableTreeNode("font");

//         style.add(color);
//         style.add(font);

//         DefaultMutableTreeNode green = new DefaultMutableTreeNode("green");
//         DefaultMutableTreeNode white = new DefaultMutableTreeNode("white");
//         DefaultMutableTreeNode red = new DefaultMutableTreeNode("red");
//         DefaultMutableTreeNode black = new DefaultMutableTreeNode("black");
//         DefaultMutableTreeNode orange = new DefaultMutableTreeNode("orange");

//         DefaultMutableTreeNode arial = new DefaultMutableTreeNode("arial");
//         DefaultMutableTreeNode arial1 = new DefaultMutableTreeNode("arial1");
//         DefaultMutableTreeNode arial2 = new DefaultMutableTreeNode("arial2");

//         color.add(red);
//         color.add(green);
//         color.add(white);
//         color.add(orange);
//         color.add(black);

//         font.add(arial);
//         font.add(arial1);
//         font.add(arial2);

//         JTree jt = new JTree(style);
//         frame.add(jt);
//         frame.setSize(200, 200);
//         frame.setVisible(true);

//     }

//     public static void main(String[] args) {
//         new swingclass1();
//     }
// }

// ================ JTABLE ============================

// import javax.swing.*;

// public class swingclass1 {
//     swingclass1() {
//         JFrame frame = new JFrame("jtable example");

//         String data[][] = { { "1", "amit", "4567890" }, { "2", "aman", "7333" }, { "2", "aman", "7333" },{ "2", "aman", "7333" },{ "2", "aman", "7333" },{ "2", "aman", "7333" },{ "2", "aman", "7333" },{ "2", "aman", "7333" },{ "2", "aman", "7333" },{ "2", "aman", "7333" },{ "2", "aman", "7333" },{ "2", "aman", "7333" },{ "2", "aman", "7333" },{ "2", "aman", "7333" },{ "2", "aman", "7333" },{ "2", "aman", "7333" },{ "2", "aman", "7333" },{ "2", "aman", "7333" },{ "2", "aman", "7333" },{ "2", "aman", "7333" },{ "2", "aman", "7333" },{ "2", "aman", "7333" },{ "2", "aman", "7333" },{ "2", "aman", "7333" },{ "2", "aman", "7333" },{ "2", "aman", "7333" },{ "2", "aman", "7333" },{ "3", "amazon", "34466" } };
//         String heading[] = { "ID", "Name", "random number" };
//         JTable jt = new JTable(data, heading);

//         jt.setBounds(30, 40, 200, 300);
//         JScrollPane sp = new JScrollPane(jt);
//         frame.add(sp);
//         frame.setSize(300, 400);
//         frame.setVisible(true);
//     }

//     public static void main(String[] args) {
//         new swingclass1();
//     }
// }

// ================ JTABBEDPANE ============================

import javax.swing.*;

public class swingclass1 {
    swingclass1() {
        JFrame frame = new JFrame("jtabbedpane example");

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(50, 50, 300, 300);
        tp.add("screen1", p1);
        tp.add("screen2", p2);
        tp.add("screen3", p3); 

        frame.add(tp);

        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new swingclass1();
    }
}