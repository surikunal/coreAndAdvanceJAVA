// ============ SET LAYOUT =====================
//===============================================

// =============== BORDER LAYOUT =================

// import java.awt.BorderLayout;
// import javax.swing.*;
// public class swingclass {

//     swingclass() {
//         JFrame frame = new JFrame("Border layout");

//         JButton button = new JButton("left");
//         JButton button1 = new JButton("right");
//         JButton button2 = new JButton("top");
//         JButton button3 = new JButton("bottom");
//         JButton button4 = new JButton("center");

//         frame.add(button, BorderLayout.WEST);
//         frame.add(button1, BorderLayout.EAST);
//         frame.add(button2, BorderLayout.NORTH);
//         frame.add(button3, BorderLayout.SOUTH);
//         frame.add(button4, BorderLayout.CENTER);

//         frame.setSize(300, 300);
//         frame.setVisible(true);
//     }

//     public static void main(String[] args) {
//         new swingclass();
//     }
// }


// =============== FLOW LAYOUT =================

// import java.awt.FlowLayout;
// import javax.swing.*;
// public class swingclass {

//     swingclass() {
//         JFrame frame = new JFrame("Flow layout");
        
//         JButton button = new JButton("button");
//         JButton button1 = new JButton("button1");
//         JButton button2 = new JButton("button2");
//         JButton button3 = new JButton("button3");
//         JButton button4 = new JButton("button4");

//         frame.add(button);
//         frame.add(button1);
//         frame.add(button2);
//         frame.add(button3);
//         frame.add(button4);

//         frame.setLayout(new FlowLayout());
//         frame.setSize(400, 400);
//         frame.setVisible(true);

//     }

//     public static void main(String[] args) {
//         new swingclass();
//     }
// }


// =============== GRIDBAG LAYOUT =================

import java.awt.GridLayout;
import javax.swing.*;
public class swingclass {

    swingclass() {
        JFrame frame = new JFrame("Gridbag Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton button = new JButton("button");
        JButton button1 = new JButton("button1");
        JButton button2 = new JButton("button2");
        JButton button3 = new JButton("button3");
        JButton button4 = new JButton("button4");

        frame.add(button);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);

        frame.setLayout(new GridLayout(2, 3));
        frame.setSize(400, 400);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new swingclass();
    }
}
