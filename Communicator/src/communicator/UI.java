package communicator;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
import java.util.*;

public class UI extends JFrame implements ActionListener, KeyListener, WindowListener {
    
    //private final JTextArea panelg;
    //private final JScrollPane skr;
    private final JTextField tf;
    //private final JButton bok;
    
    public UI(){
        super("Communicator");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JPanel panelTop =  new JPanel();
        add(panelTop, BorderLayout.CENTER);
        JPanel panelBottom = new JPanel();
        add(panelBottom, BorderLayout.SOUTH);
        panelBottom.setLayout(new BorderLayout());
        JTextField field1 =  new JTextField();
        panelBottom.add(field1, BorderLayout.CENTER);
        JButton button1 = new JButton("OK");
        button1.addActionListener(this);
        panelBottom.add(button1, BorderLayout.EAST);
        tf = new JTextField();
        tf.addKeyListener(this);
        /*
        Container interior = getContentPane();
        interior.setLayout(new BorderLayout());
	panelg = new JTextArea();
	panelg.setEditable(false);
        skr=new JScrollPane(panelg);
	interior.add(skr, BorderLayout.CENTER);
	JPanel paneld=new JPanel();
	paneld.setLayout(new BorderLayout());
	tf=new JTextField();
	paneld.add(tf, BorderLayout.CENTER);
        bok=new JButton("OK");
	bok.addActionListener(this);
	tf.addKeyListener(this);
	paneld.add (bok, BorderLayout.EAST);
        */
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("OK");
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosed(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
