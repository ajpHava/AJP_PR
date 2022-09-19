import javax.swing.text.TabExpander;
import javax.swing.*;
import java.awt.FlowLayout;
public class JtableDemo extends JFrame{
    JTable table ; 
    JScrollPane jPane;
    java.awt.Container containerDemo;
    public JtableDemo(){
        String [][]rowData = {{"101" ,"Amit","670000" },{"102","Jay","780000"},{"101","Sachin","700000"}};
        String []columnNames = {"ID" ,"Name","Salary"};
        table = new JTable(rowData, columnNames);
        containerDemo = getContentPane();
        table.setBounds(30,40,200,300);   
        jPane = new JScrollPane(table);
        containerDemo.add(jPane );
        setSize(500,500);
        setVisible(true);
        

    }
    public static void main(String[] args) {
        new JtableDemo();
    }
}