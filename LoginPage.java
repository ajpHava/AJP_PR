import java.awt.Frame;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;

public class LoginPage extends Frame{
	Button loginButton ;
	TextField userName , password ;
	Label userNameLabel , passwordLabel;
	public LoginPage(){
		setVisible(true);
		setSize(500,500);
		setLayout(null);
		
		userNameLabel = new Label("Username");
		passwordLabel = new Label("Password");
		userName = new TextField();
		password = new TextField();
		loginButton = new Button("Login");
		
		userNameLabel.setBounds(150 , 45 , 100 , 30);
		userName.setBounds(260 , 50 , 100 , 20);
		passwordLabel.setBounds(150, 85 , 100 , 30);
		password.setBounds(260 , 90 , 100 , 20);
		loginButton.setBounds(200 , 130 , 100 , 30);
		
		add(userNameLabel);
		add(passwordLabel);
		add(userName);
		add(password);
		add(loginButton);
		
	}
	public static void main(String args[]){
		new LoginPage();
	}
}