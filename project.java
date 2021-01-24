import javax.swing.*;
// public class project {
//     public static void main(String[] args) {

//         // JFrame a = new JFrame("example");
//         // JButton b = new JButton("click me");

//         // b.setBounds(30, 40, 85, 20);     /* x-coordinate, y-coordinate, width, height */
//         // a.add(b);                   // add the button into the frame
//         // a.setSize(300, 600);    // widht, height
//         // a.setLayout(null);      // defines the layout
//         // a.setVisible(true);     // visibility of frame....

//         //=====================================================================

//         // JFrame a = new JFrame("example");
//         // JTextField tx = new JTextField("my name");
//         // tx.setBounds(50, 100, 200, 30);
//         // a.add(tx);
//         // a.setSize(300, 300);
//         // a.setLayout(null);
//         // a.setVisible(true);

//         //=====================================================================

//         // JFrame a = new JFrame("gsyay classes");
//         // JScrollBar b = new JScrollBar();
//         // b.setBounds(90, 90, 40, 90);
//         // a.add(b);
//         // a.setSize(300, 300);
//         // a.setLayout(null);
//         // a.setVisible(true);

//     }
// }

// public class project {

//     project() {
//         JFrame a = new JFrame("kunal");
//         JPanel p = new JPanel();
//         p.setBounds(40, 70, 200, 200);
//         JButton btn = new JButton("click me");
//         btn.setBounds(60, 50, 80, 40);
//         p.add(btn);
//         a.add(p);   
//         a.setSize(300, 300);
//         a.setLayout(null);
//         a.setVisible(true);
//     }

//     public static void main(String[] args) {
//         new project();
//     }
// }


// public class project {

//     JMenu menu;
//     JMenuItem a1, a2;

//     project() {
//         JFrame a = new JFrame("Example");

//         menu = new JMenu("options");
//         JMenuBar m1 = new JMenuBar();
//         a1 = new JMenuItem("project 1");
//         a2 = new JMenuItem("project 2"); 

//         menu.add(a1);
//         menu.add(a2);
//         m1.add(menu);
//         a.setJMenuBar(m1);
//         a.setSize(400, 400);
//         a.setLayout(null);
//         a.setVisible(true);
//     }

//     public static void main(String[] args) {
//         new project();
//     }
// }


public class project {

    project() {
        // JFrame a = new JFrame("Example");

        // DefaultListModel<String> lis = new DefaultListModel<>();
        // lis.addElement("first element");
        // lis.addElement("second element");
        // lis.addElement("third element");
        // lis.addElement("forth element");

        // JList<String> b = new JList<>(lis);
        // b.setBounds(100, 100, 75, 75);

        // a.add(b);
        // a.setSize(400, 400);
        // a.setVisible(true);
        // a.setLayout(null);

        //=========================================================

        JFrame a = new JFrame("Example");
        JLabel b1;
        b1 = new JLabel("kunalsuri");
        
        b1.setBounds(40,40,90,20);
        a.add(b1);
        a.setSize(400, 400);
        a.setLayout(null);
        a.setVisible(true);
    }

    public static void main(String[] args) {
        new project();
    }
}