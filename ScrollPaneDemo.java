import javax.swing.JFrame;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Container;
import java.awt.FlowLayout;
public class ScrollPaneDemo extends JFrame{

	private JTextArea co;
	private JScrollPane jScrollPane;
	private Container c;
	public ScrollPaneDemo(){
	
		c = getContentPane();
		c.setLayout(new FlowLayout());
		co = new JTextArea();
		/*
		 int  vGap = 5;
		 int  hGap = 5;
	
		int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
		int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
				jScrollPane = new JScrollPane(co,v,h);
				*/
		c.add(co);
		//c.add(jScrollPane);
		setSize(500,500);
		setVisible(true);
	}

	public static void main(String args[]){
		new ScrollPaneDemo();
	}
}