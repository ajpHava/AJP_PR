import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 class JComboBoxDemo extends JFrame implements ItemListener {
	 JComboBox cb;
		JLabel l1;
 public JComboBox()
 setVisible(true);
 setSize(100,100);
 setLayout(new FlowLayout);
 setDefaultCloseOperation(JFrame_EXIT_ON_CLOSE);
 container c= getContentPane();
 cb= new JComboBox();
 cb.addItem("Pune");
 cb.addItem("Solapur");
 cb.addItem("Banglore");
 cb.addItem("Mumbai");
 c.add(cb);
 l1=new JLabel();
 c.addItemListner(this);
 }
 public void  itemStateChanged(ItemEvenr e) {
string s=(String)e.getItem();
l1.setText(s);
}
public static void main (String args[]) 
new JComboBoxDemo();
}
}