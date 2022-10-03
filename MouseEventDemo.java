import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Dimension;
public class MouseEventDemo extends JFrame{

    public MouseEventDemo(){
        setSize(500, 300);
        setVisible(true);
        addMouseListener(new MouseListener()
        {

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub

                getContentPane().setBackground(new Color(0,0,1));
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub
                // TODO Auto-generated method stub

                getContentPane().setBackground(new Color(0,12,1));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub
                getContentPane().setBackground(new Color(0,112,192));
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // TODO Auto-generated method stub
                getContentPane().setBackground(new Color(255,12,0));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                getContentPane().setBackground(new Color(20,255,1));
                
            }
            
        });


    }
    public static void main(String[] args) {
        new MouseEventDemo();
    }
}