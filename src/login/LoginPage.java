package login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import models.Activity;
import pages.CataloguePage;

public class LoginPage implements ActionListener{
	
	JFrame frame = new JFrame();
	JLabel labelUser = new JLabel("Nom: ");
	JTextField userInput = new JTextField();
	JLabel labelPassword = new JLabel("Môt de passe: ");
	JPasswordField userPass = new JPasswordField();
	JButton submitBtn = new JButton("Envoyer");
	JButton resetBtn = new JButton("Annuler");
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==submitBtn) {
			String user = userInput.getText();
			System.out.println("User name:" + "admin".equals(user));
			String userPassword = String.valueOf(userPass.getPassword());
			
			if(("admin".equals(user))) {
				System.out.println("call cataloguePage");
				frame.dispose();
				Activity a1 = new Activity(1, "parashute");
				Activity a2 = new Activity(2, "saute");
				ArrayList<Activity> act = new ArrayList<Activity>();
				act.add(a1);
				act.add(a2);
				CataloguePage cataloguePage = new CataloguePage(act);
			}
		} else {
			userInput.setText("");
			System.out.println("at loginPage");
		}
		
	}
	
	LoginPage() {
		labelUser.setBounds(50, 100, 120, 30);
		userInput.setBounds(150, 100, 200, 30);
		labelPassword.setBounds(50, 150, 120, 30);
		userPass.setBounds(150, 150, 200, 30);
		resetBtn.setBounds(100, 250, 100, 30);
		submitBtn.setBounds(220, 250, 100, 30);
		resetBtn.addActionListener(this);
		submitBtn.addActionListener(this);
				
		frame.add(labelUser);
		frame.add(userInput);
		frame.add(labelPassword);
		frame.add(userPass);
		frame.add(submitBtn);
		frame.add(resetBtn);
	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	
}
