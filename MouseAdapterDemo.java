import java.awt.Event;
import java.awt.Frame;
import java.awt.Window;
import java.awt.event.*;

import org.w3c.dom.events.MouseEvent;

class FrameDemo extends Frame implements MouseMotionListener{
    Frame f;
    public FrameDemo(){
        f = new Frame();
        f.addMouseMotionListener(this);
        setSize(500,500);
        setVisible(true);
    }

    @Override
    public void mouseDragged(java.awt.event.MouseEvent e) {
        f.setTitle("Mouse Dragged");
        
    }

    @Override
    public void mouseMoved(java.awt.event.MouseEvent e) {
        f.setTitle("Mouse Moved");
        
    }
}


public class MouseAdapterDemo extends FrameDemo   {

    

    public static void main(String[] args) {
        new FrameDemo();
    }
     
}
