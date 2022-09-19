import javax.swing.JComboBox;
//import java.awt.event.ItemEvent;
//import java.awt.event.ItemListener;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.*;
//import java.awt.FlowLayout;
public class ComboEvent extends JFrame implements ItemListener{

	private JComboBox co;
	private JLabel l;
	private Container c;
	public ComboEvent(){
	 
		c = getContentPane();
		c.setLayout(new FlowLayout());
		co = new JComboBox();
		co.addItem("Solapur");
		co.addItem("Pune");
		co.addItem("Banglore");
		co.addItem("Mumbai");
		
		l = new JLabel();
		c.add(co);
		c.add(l);
		co.addItemListener(this);
		setSize(500,500);
		setVisible(true);
	}

	public void itemStateChanged(ItemEvent it){
		l.setText("You selected "+(String)co.getSelectedItem());
	}

	public static void main(String args[]){
		new ComboEvent();
	}
}
	
