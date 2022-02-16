package jvn;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class tuan1 {

    public tuan1() {
        maytinh();
    }

    void maytinh() {
        JFrame khungmaytinh = new JFrame("Máy tính bỏ túi");
        JButton btn1 = new JButton("AC");
        JButton btn2 = new JButton("X");
        JButton btn3 = new JButton("%");
        JButton btn4 = new JButton("/");
        JButton btn5 = new JButton("7");
        JButton btn6 = new JButton("8");
        JButton btn7 = new JButton("9");
        JButton btn8 = new JButton("X");
        JButton btn9 = new JButton("4");
        JButton btn10= new JButton("5");
        JButton btn11 = new JButton("6");
        JButton btn12 = new JButton("-");
        JButton btn13 = new JButton("1");
        JButton btn14 = new JButton("2");
        JButton btn15 = new JButton("3");
        JButton btn16 = new JButton("+");
        JButton btn17 = new JButton("...");
        JButton btn18 = new JButton("0");
        JButton btn19 = new JButton(",");
        JButton btn20 = new JButton("=");
        JTextArea text = new JTextArea();
        
        btn1.setBounds(10, 300, 85, 45);
        btn2.setBounds(110, 300, 85, 45);
        btn3.setBounds(210, 300, 85, 45);
        btn4.setBounds(310, 300, 85, 45);
        btn5.setBounds(10, 350, 85, 45);
        btn6.setBounds(110, 350, 85, 45);
        btn7.setBounds(210, 350, 85, 45);
        btn8.setBounds(310, 350, 85, 45);
        btn9.setBounds(10, 400, 85, 45);
        btn10.setBounds(110, 400, 85, 45);
        btn11.setBounds(210, 400, 85, 45);
        btn12.setBounds(310, 400, 85, 45);
        btn13.setBounds(10, 450, 85, 45);
        btn14.setBounds(110, 450, 85, 45);
        btn15.setBounds(210, 450, 85, 45);
        btn16.setBounds(310, 450, 85, 45);
        btn17.setBounds(10, 500, 85, 45);
        btn18.setBounds(110, 500, 85, 45);
        btn19.setBounds(210, 500, 85, 45);
        btn20.setBounds(310, 500, 85, 45);
        text.setBounds(20, 20, 360, 250);
        text.setBorder(new LineBorder(Color.GREEN, 3));
        khungmaytinh.add(btn1);
        khungmaytinh.add(btn2);
        khungmaytinh.add(btn3);
        khungmaytinh.add(btn4);
        khungmaytinh.add(btn5);
        khungmaytinh.add(btn6);
        khungmaytinh.add(btn7);
        khungmaytinh.add(btn8);
        khungmaytinh.add(btn9);
        khungmaytinh.add(btn10);
        khungmaytinh.add(btn11);
        khungmaytinh.add(btn12);
        khungmaytinh.add(btn13);
        khungmaytinh.add(btn14);
        khungmaytinh.add(btn15);
        khungmaytinh.add(btn16);
        khungmaytinh.add(btn17);
        khungmaytinh.add(btn18);
        khungmaytinh.add(btn19);
        khungmaytinh.add(btn20);
        khungmaytinh.add(text);
        khungmaytinh.setLayout(null);
        khungmaytinh.setSize(420, 600);
        khungmaytinh.setVisible(true);
        khungmaytinh.setLocationRelativeTo(null);
        khungmaytinh.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new tuan1();
    }
}
