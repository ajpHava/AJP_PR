import javax.swing.text.TabExpander;
import javax.swing.*;
import java.awt.FlowLayout;
public class JtableDemo1 extends JFrame{
    JTable table ; 
    JScrollPane jPane;
    java.awt.Container containerDemo;
    public JtableDemo1(){
        String [][]rowData = {{"Tushar" ,"90","A" },{"Prathmesh","90","A"},{"Suresh","89","B"}};
        String []columnNames = {"Name" ,"Percentage","Grade"};
        table = new JTable(rowData, columnNames);
        containerDemo = getContentPane();
        table.setBounds(30,40,200,300);   
        jPane = new JScrollPane(table);
        containerDemo.add(jPane );
        setSize(500,500);
        setVisible(true);
        

    }
    public static void main(String[] args) {
        new JtableDemo1();
    }
}