import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;

class JTreeDemo extends JFrame{
	public JTreeDemo(){
		Container c = getContentPane();
		
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("India");
		DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Maharashtra Jindabad");
		DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Gujrat");
		DefaultMutableTreeNode child1_1 = new DefaultMutableTreeNode("Mumbai");
		DefaultMutableTreeNode child1_2 = new DefaultMutableTreeNode("Pune");
		DefaultMutableTreeNode child1_3 = new DefaultMutableTreeNode("Nashik");
		DefaultMutableTreeNode child1_4 = new DefaultMutableTreeNode("Nagpur");
		child1.add(child1_1);
		child1.add(child1_2);
		child1.add(child1_3);
		child1.add(child1_4);
		root.add(child1);
		root.add(child2);
		JTree tree = new JTree(root);
		int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
		int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
		JScrollPane jScrollPane = new JScrollPane(tree,v,h);
		c.add(jScrollPane,BorderLayout.WEST);
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String args[]){
		new JTreeDemo();
	}
}
