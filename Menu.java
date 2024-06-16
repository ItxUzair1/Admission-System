package Myproject;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Menu extends JFrame implements ActionListener {
	  JFrame jf = new JFrame();
	  
	  JButton LoginButton= new JButton("Login");
	  JButton RegisterButton= new JButton("Registration");
	  JButton QuizButton = new JButton("Test");
	  ImageIcon icon;
	  JLabel IamgeLabel;
	  public void Start(){
		  MenuImage();
		  Menu();
		  setMenu();
		  addMenu();
		  addAction();
	  }
	  public void Menu() {
     jf.getContentPane().setLayout(null);
	jf.setBounds(350,250, 500, 280);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jf.setVisible(true);
	jf.setResizable(false);
	  }
	public void addMenu() {
		jf.add(RegisterButton);
		jf.add(LoginButton);
		jf.add(QuizButton);
		jf.add(IamgeLabel);
		//jf.setVisible(true);
	}
	public void MenuImage() {
		icon = new ImageIcon(("C:\\Users\\Muhammad Uzair\\Downloads\\iba2.jpg"));
		IamgeLabel = new JLabel(icon);
	}
    public void setMenu() {
    IamgeLabel.setBounds(0,0 ,500,280);
 	RegisterButton.setBounds(150, 50, 130, 23);
 	RegisterButton.setBackground(Color.cyan);
	LoginButton.setBounds(150, 100, 130, 23);
	LoginButton.setBackground(Color.cyan);
	QuizButton.setBounds(150,150,130,23);
	QuizButton.setBackground(Color.cyan);
    }

    public void addAction() {
    	
	 RegisterButton.addActionListener(this);
	 LoginButton.addActionListener(this);
     QuizButton.addActionListener(this);
	  }
	  @Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			LoginWindow obj= new LoginWindow();
			  if(e.getSource()==LoginButton) {

				  obj.Login();
				  jf.dispose();
			  }
			  if(e.getSource()==RegisterButton) {
				  Register obj2 = new Register();
				 obj2. RegistrationForm();
			jf.dispose();
		}
			  if(e.getSource()==QuizButton) {
				  Test1 obj2 = new Test1();
				    
				    obj2.Test_Menu();
			  }
	  }
	public static void main(String[] args) {
		Menu ob = new Menu();
		
		ob.Start();
		
	}
}
