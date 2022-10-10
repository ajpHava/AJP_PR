import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JApplet;
import javax.swing.JLabel;


public class Demo extends Applet
{
    public void init()
    {
        JLabel l = new JLabel();
        add(l);
        addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent e)
            {
                showStatus("Pressed key is "+e.getKeyChar());
            }
        });
    }
}
//<applet code = "Demo.class" width=500 height=500></applet>