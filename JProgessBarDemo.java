import javax.swing.JFrame;

import javax.swing.*;
import java.awt.event.*;

public class JProgessBarDemo extends JFrame implements ActionListener {
    java.awt.Container container;
    Thread thread;
    JProgressBar jProgressBar;
    JProgressBar jProgressBar2;

    // Runnable r;

    JButton clickButton = new JButton("Click Me");
    JButton dailougeButton = new JButton("Click To Me");

    public JProgessBarDemo() {
        container = getContentPane();
        container.setLayout(null);
        clickButton.setBounds(100, 150, 100, 50);
        dailougeButton.setBounds(100, 220, 100, 50);
        jProgressBar = new JProgressBar(JProgressBar.HORIZONTAL, 1, 100);
        jProgressBar.setBounds(10, 30, 250, 30);
        jProgressBar2 = new JProgressBar(JProgressBar.VERTICAL, 1, 100);
        jProgressBar2.setBounds(300, 30, 30, 250);

        clickButton.addActionListener(this);
        dailougeButton.addActionListener(this);

        container.add(clickButton);
        container.add(dailougeButton);
        container.add(jProgressBar);
        container.add(jProgressBar2);
        setSize(500, 500);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand() == "Click Me") {
            thread = new Thread() {
                public void run() {
                    try {
                        for (int i = 1; i <= 100; i++) {
                            jProgressBar.setValue(i);
                            jProgressBar.setStringPainted(true);
                            Thread.sleep(100);

                        }
                    } catch (InterruptedException e1) {

                    }
                }
            };
            thread.start();
        }else{
            thread = new Thread() {
                public void run() {
                    try {
                        for (int i = 1; i <= 100; i++) {
                            jProgressBar2.setValue(i);
                            jProgressBar2.setStringPainted(true);
                            Thread.sleep(100);

                        }
                    } catch (InterruptedException e1) {

                    }
                }
            };
            thread.start();

        }

    }

    public static void main(String[] args) {
        new JProgessBarDemo();
    }
}
