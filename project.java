// import javax.swing.*;
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


import javax.swing.*;
public class project {
    
    project() {
        JFrame a = new JFrame("kunal");
        JPanel p = new JPanel();
        p.setBounds(40, 70, 200, 200);
        JButton btn = new JButton("click me");
        btn.setBounds(60, 50, 80, 40);
        p.add(btn);
        a.add(p);   
        a.setSize(300, 300);
        a.setLayout(null);
        a.setVisible(true);
    }


    public static void main(String[] args) {
        new project();
    }
}