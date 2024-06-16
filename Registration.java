package Myproject;
import java.sql.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;

class Register extends JFrame implements ActionListener{
	String[] gender = {"Male","Female"};
	JFrame JF = new JFrame();
	JLabel name = new JLabel("NAME");
	JLabel FatherName = new JLabel("Father Name");
	JLabel Gender = new JLabel("Gender");
	JLabel Password = new JLabel("Pasword");
	JLabel ConfirmPassword = new JLabel("Confirm Password");
	JLabel Email = new JLabel("EMAIL");
	JTextField namefield = new JTextField();
	JTextField parentfield = new JTextField();
	JComboBox GenderBox = new JComboBox(gender);
	JPasswordField PasswordBox = new JPasswordField();
	JPasswordField CPasswordBox = new JPasswordField();
	JTextField EmailBox = new JTextField();
	JButton cancelButton = new JButton("Cancel");
	JButton AddButton = new JButton("ADD");
	
	
	public void FormWindow(){
		JF = new JFrame();
		JF.setTitle("Regsitration FORM");
		JF.setBounds(40, 40, 380, 600);
		JF.setBackground(Color.black);
		JF.getContentPane().setLayout(null);
		JF.setVisible(true);
		JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void setLocation(){
		name.setBounds(20,20,40,70);
		FatherName.setBounds(20,70,80,70);
		Gender.setBounds(20,120,100,70);
		Password.setBounds(20,170,100,70);
		ConfirmPassword.setBounds(20,220,140,70);
		Email.setBounds(20,270,160,70);
		namefield.setBounds(180,43,165,23);
		parentfield.setBounds(180,93 ,165, 23);
		GenderBox.setBounds(180,143 , 165, 23);
		PasswordBox.setBounds(180,193,165,23);
		CPasswordBox.setBounds(180,243,165,23);
		EmailBox.setBounds(180,293,165,23);
		cancelButton.setBounds(70,400,100,35);
		AddButton.setBounds(220,400,100,35 );
	
		
	}
	public void adding(){
	    JF.add(name);
		JF.add(FatherName);
		JF.add(Gender);
		JF.add(Password);
		JF.add(ConfirmPassword);
		JF.add(Email);
		JF.add(namefield);
		JF.add(parentfield);
		JF.add(GenderBox);
		JF.add(PasswordBox);
		JF.add(CPasswordBox);
		JF.add(EmailBox);
		JF.add(cancelButton);
		JF.add(AddButton);
	}
	public void actionEvent(){
		cancelButton.addActionListener(this);
		AddButton.addActionListener(this);
	}
    public boolean SameUser(String name,String father) {
    	try {
    	Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","123456");
		 Statement s = connection.createStatement();
		 String q =  "select * from student where USERNAME='"+name+"'and FATHER_NAME ='"+father+"'";

		 ResultSet r = s.executeQuery(q);
		 if(r.next()) {
			 return true;
		 }
		 else {
			 return false;
		 }
    }catch(SQLException e) {
    e.printStackTrace(); 
    }
    	return false;
    }
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Menu obj = new Menu();
		
	 if(e.getSource()==AddButton) {
		 try { 
			 Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","123456");
			 PreparedStatement PS=connection.prepareStatement("insert into student values(?,?,?,?,?,?)");
			 
			 PS.setString(1,namefield.getText());
			 PS.setString(2,parentfield.getText());
			 PS.setString(3,GenderBox.getSelectedItem().toString());
			 
			
			 PS.setString(4,PasswordBox.getText());
			 PS.setString(5,CPasswordBox.getText());
			 PS.setString(6,EmailBox.getText());
			 
			 String name=namefield.getText();
			 String parent=parentfield.getText();
			 String Email=EmailBox.getText();
			 
			 String sq= "select * from student where EMAIL='"+Email+"'"; 
			 Statement st=connection.createStatement();
			 ResultSet rs = st.executeQuery(sq);
			 Boolean flag = SameUser(name,parent);
			 
			 if((namefield.getText().equals(""))||(parentfield.getText().equals(""))||(PasswordBox.getText().equals(""))||(CPasswordBox.getText().equals(""))||(EmailBox.getText().equals(""))) {
				 JOptionPane.showMessageDialog(null, "Error");
			 } 
			  if(PasswordBox.getText().equals(CPasswordBox.getText())&&(!((PasswordBox.getText().equals("")&&CPasswordBox.getText().equals("")))&&(!(namefield.getText().equals(""))&&(!(parentfield.getText().equals(""))&&(!(PasswordBox.getText().equals(""))&&(!(CPasswordBox.getText().equals(""))&&(!(EmailBox.getText().equals(""))))))))) {
			   if(SameUser(name,parent)&&rs.next()) {
					 JOptionPane.showMessageDialog(null, "This User Already Exist");
				 }
			   else if(rs.next()&&flag==false) {
					 JOptionPane.showMessageDialog(null, "This Email already exist");
				 }
				 
			   else if(!(rs.next())&&flag==false) {
					 PS.executeUpdate();
					 JOptionPane.showMessageDialog(null, "Sucessfully registered");
				 }
			 }
			 
		 } catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 }
		 
	
	 if(e.getSource()==cancelButton) {
		 JF.dispose();
		 obj.Start();
	 }
	}	
	
	public void RegistrationForm() {
		FormWindow();
		setLocation();
		adding();
		actionEvent();
	}
}
 public class Registration {
	 
 public static void main(String args[]){
	
	
	
 }
   
}
