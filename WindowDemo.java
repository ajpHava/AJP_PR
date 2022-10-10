import java.awt.Event;
import java.awt.Frame;
import java.awt.Window;
import java.awt.event.*;

import javafx.scene.control.Label;
public class WindowDemo extends Frame {

    public WindowDemo() {
        Frame  frame = new Frame();
        frame.addMouseMotionListener(new MouseMotionAdapter() {

            @Override
            public void mouseDragged(MouseEvent e) {
                frame.setTitle("Mouse Dragged");
            }
            
            
        });
        frame.addWindowListener(new WindowAdapter(){

            @Override
            public void windowClosing(WindowEvent e) {
                // TODO Auto-generated method stub
                frame.dispose();
                super.windowClosing(e);
            }
            
        });
        
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new WindowDemo();
    }
     
}
