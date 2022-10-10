import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Container;

public class LoginPage extends JFrame {
	JButton loginButton;
	JTextField userName;
	JPasswordField password;
	Label userNameLabel, passwordLabel;
	Container container;

	public LoginPage() {
		setSize(500, 500);
		setLayout(null);
		container = getContentPane();

		userNameLabel = new Label("Username");
		passwordLabel = new Label("Password");
		userName = new JTextField();
		password = new JPasswordField();
		password.setEchoChar('#');
		loginButton = new JButton("Login");

		userNameLabel.setBounds(150, 45, 100, 30);
		userName.setBounds(260, 50, 100, 20);
		passwordLabel.setBounds(150, 85, 100, 30);
		password.setBounds(260, 90, 100, 20);
		loginButton.setBounds(200, 130, 100, 30);

		loginButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (new String(password.getPassword()).length() < 6) {
					JOptionPane.showMessageDialog(null, "Password Length Should be greater than 6");
					if (new String(password.getPassword()).equals("admin")) {
						JOptionPane.showMessageDialog(null, "Login Done");
					} else {
						JOptionPane.showMessageDialog(null, "Login Failed");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Enter password Properly");
				}

			}
		});

		container.add(userNameLabel);
		container.add(passwordLabel);
		container.add(userName);
		container.add(password);
		container.add(loginButton);

		setVisible(true);
	}

	public static void main(String args[]) {
		new LoginPage();
	}
}