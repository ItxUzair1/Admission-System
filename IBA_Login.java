package Myproject;

import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
class LoginWindow implements ActionListener{
	static  String mail;
	JPanel panel;
	JFrame frame;
	JLabel labelEmail = new JLabel("Email");
	JLabel labelPassword = new JLabel("Password");
	JTextField EmailField = new JTextField();
	JPasswordField PasswordField = new JPasswordField();
	JButton LoginButton = new JButton("Login");
	JButton CancelButton = new JButton("Cancel");
	ImageIcon LoginImage;
	JLabel ILabel;
	

	public void LoginForm(){
		 frame = new JFrame();
		 frame.setBackground(Color.red);
		 frame.setBounds(400, 100, 700, 300);
		 frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		 frame.getContentPane().setLayout(null);
		 
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		
		 frame.setResizable(false);
		
         frame.setVisible(true);
         
			
	}
	public void Panel() {
		panel = new JPanel();
		panel.setBounds(0, 0, 380, 320);
		panel.setLayout(null);
		panel.setVisible(true);
	}
	public void setImage() {
		LoginImage = new ImageIcon("C:\\Users\\Muhammad Uzair\\Downloads\\iba7.jpg");
		ILabel = new JLabel(LoginImage);
	}
	
	public void AddingCompenents(){
	frame.getContentPane().add(panel);
	frame.add(labelEmail);
	frame.add(labelPassword);
	frame.add(EmailField);
	frame.add(PasswordField);
	frame.add(LoginButton);
	frame.add(CancelButton);
	panel.add(ILabel);
	}
	public void Location(){
		ILabel.setBounds(0, -23, 380, 300);
		labelEmail.setBounds(410, 20, 40, 70);
		labelPassword.setBounds(400, 100, 80, 70);
		EmailField.setBounds(500,43,165,23);
		PasswordField.setBounds(500,120 ,165, 23);
		LoginButton.setBounds(440,200,80,25);
		CancelButton.setBounds(570,200,80,25);
		//panel.setBounds(10, 10, 10, 10);
	}
	public void Login() {
		
		LoginForm();
        setImage();
		Panel();
		AddingCompenents();
		Location();
		AddAction();
		
	
		
	}
	public void AddAction() {
		LoginButton.addActionListener(this);
		CancelButton.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Menu obj = new Menu();
		boolean flag = false;
		if(e.getSource()==LoginButton) {
			 try {
				 Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","123456");
				 String email = EmailField.getText();
				 String Password = PasswordField.getText();
				 Statement st = connection.createStatement();
				 String sq= "select * from student where EMAIL='"+email+"'and Password='"+Password+"'";
				 ResultSet rs = st.executeQuery(sq);
				 if(rs.next()) {
					 mail=EmailField.getText();
					 JOptionPane.showMessageDialog(null, mail);
					 try {
						 Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/CheckForm","root","123456");
						 PreparedStatement s = con.prepareStatement("SELECT approve FROM Form WHERE Email=?");
						 s.setString(1, mail);
						 ResultSet r = s.executeQuery();
						 if(r.next()) {
							 flag=r.getBoolean("approve");
							 
						 }
						 else {
							 flag=false;
						 }
					 }catch(SQLException e1) {
						 e1.printStackTrace();
					 }
					 if(flag) {
						 JOptionPane.showMessageDialog(null, "You have already submitted the form");
					 }
					 else {
				PersonalInformation PI= new PersonalInformation();
				PI.PersonalWindow();
				frame.dispose();
				 }
				 }
				 else {
					 JOptionPane.showMessageDialog(null, "incorrect");
				 }
			 } catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			 }
		
		if(e.getSource()==CancelButton) {
			frame.dispose();
			 obj.Start();
		 }
		
	}
}
public class IBA_Login {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LoginWindow a = new LoginWindow();
		a.Login();
	}

}
