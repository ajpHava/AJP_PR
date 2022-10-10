import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*;


public class MultiplicationDemo extends JFrame {
    JLabel lblNumber1 , lblNumber2 , result;
    JTextField txtNumber1 , txtNumber2;
    JButton submitButton;
    public MultiplicationDemo(){
        setSize(500,500);
        setLayout(null);
        result = new JLabel();
        lblNumber1 = new JLabel("Enter First Number ");
        lblNumber1.setBounds(250, 100, 100, 20);
        txtNumber1 = new JTextField();
        txtNumber1.setBounds(250  , 80 , 100 , 20);
        lblNumber2 = new JLabel("Enter Second Number ");
        lblNumber2.setBounds(250, 110, 100, 20);
        txtNumber2 = new JTextField();
        txtNumber2.setBounds(250  , 140 , 100 , 20);
        submitButton = new JButton("Multiply");
        submitButton.setBounds(250,170,100,20);
        submitButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // result = new JLabel();
                result.setText("Addition is "+Integer.parseInt((txtNumber1.getText())+Integer.parseInt(txtNumber2.getText())));
                result.setBounds(250, 200, 100,30 );
                
                
            }

        });
        getContentPane().add(lblNumber1);
        getContentPane().add(lblNumber2);
        getContentPane().add(txtNumber1);
        getContentPane().add(txtNumber2);
        getContentPane().add(submitButton);
        getContentPane().add(result);
        setVisible(true);


    }

    public static void main(String[] args) {
        new MultiplicationDemo();
    }
    
    
}
