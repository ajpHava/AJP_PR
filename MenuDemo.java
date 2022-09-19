import java.awt.*;
class MenuDemo extends Frame{
	public MenuDemo(){
MenuBar mb = new MenuBar();
Menu n = new Menu ("colors");
MenuItem m1 = new MenuItem("Red");
MenuItem m2 = new MenuItem("Yellow");
MenuItem m3 = new MenuItem("Blue");
MenuItem m4 = new MenuItem("Black");
m4.setEnabled(false);
n.add(m1);
n.add(m2);
n.add(m3);
n.add(m4);
mb.add(n);
setMenuBar(mb);
}

public static void main (String args[])
{
MenuDemo md = new MenuDemo();
md.setSize(300,300);
md.setTitle("MenuBar");
md.setVisible(true);
}
}

