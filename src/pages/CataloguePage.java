package pages;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;

import login.LoginPage;
import models.Activity;
import models.Catalogue;

public class CataloguePage implements ActionListener{
	
	JFrame frame = new JFrame();
	JLabel catalogueLabel = new JLabel("Catalogue des activités");
	
	public CataloguePage(){
		catalogueLabel.setBounds(50, 50, 200, 30);
		frame.add(catalogueLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		}
	
	public CataloguePage(ArrayList<Activity> catalogue){
		catalogueLabel.setBounds(50, 50, 200, 30);
		frame.add(catalogueLabel);
		int y = 100;
		for(Activity activity: catalogue) {
			JLabel activityLabel = new JLabel(activity.getTitle());
			activityLabel.setBounds(50, y, 200, 30);
			frame.add(activityLabel);
			y = y +50;
		}
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
