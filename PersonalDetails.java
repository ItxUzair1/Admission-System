package Myproject;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.font.*;
import java.sql.*;

class PersonalInformation implements ActionListener{
	

	
	ImageIcon image;
	JLabel labal;
	
	JFrame jframe;
	String[] Gender = {"Male","Female"};
	JLabel nameLabel = new JLabel("Name");
	JLabel genderLabel = new JLabel("Gender");
	JLabel fathernameLabel = new JLabel("Father,s Name");
	JLabel surnameLabel = new JLabel("Surname");
	JLabel Fatheroccupation = new JLabel("Father,s Occupation");
	JLabel MobileLabel = new JLabel("Applicant Mobile");
	JLabel FathermobileLabel = new JLabel("Father,s Mobile");
	JLabel DomicileLabel = new JLabel("Domicile");
	JLabel CNICLabel = new JLabel("CNIC");
	JLabel DateOfBirthLabel = new JLabel("Date of Birth");
	JLabel emailLabel = new JLabel("Email Address");
	JLabel cityLabel = new JLabel("City");
	JLabel provinceLabel = new JLabel("Province");
	JLabel NationalityLabel = new JLabel("Nationality");
	JLabel addressLabel = new JLabel("Postal Address");
	
	JComboBox genderbox = new JComboBox(Gender);
	JTextField namefield = new JTextField();
	JTextField fathernamefield = new JTextField();
	JTextField surnamefield = new JTextField();
	JTextField fatheroccupationfield = new JTextField();
	JTextField mobilefield = new JTextField();
	JTextField fathermobilefield = new JTextField();
	JTextField domicilefield = new JTextField();
	JTextField cnicfield = new JTextField();
	JTextField dobfield = new JTextField();
	JTextField emailfield = new JTextField();
	JTextField cityfield = new JTextField();
	JTextField provincefield = new JTextField();
	JTextField nationalityfield = new JTextField();
	JTextField addressfield = new JTextField();
	JButton nextbutton = new JButton("Next");
	JButton backbutton = new JButton("Back");
	static boolean N_F,CEmail,CCnic,CNum1,CNum2;
	public void AddComponent() {
		jframe.add(labal);
		labal.add(nameLabel);
	    labal.add(genderLabel);
		labal.add(fathernameLabel);
		labal.add(surnameLabel);
		labal.add(Fatheroccupation);
		labal.add(MobileLabel);
		labal.add(FathermobileLabel);
		labal.add(DomicileLabel);
		labal.add(CNICLabel);
		labal.add(DateOfBirthLabel);
		labal.add(emailLabel);
		labal.add(cityLabel);
		labal.add(provinceLabel);
		labal.add(NationalityLabel);
		labal.add(addressLabel);
		labal.add(genderbox);
		labal.add(namefield);
		labal.add(fathernamefield);
		labal.add(surnamefield);
		labal.add(fatheroccupationfield);
		labal.add(mobilefield);
		labal.add(fathermobilefield);
		labal.add(domicilefield);
		labal.add(cnicfield);
		labal.add(dobfield);
		labal.add(emailfield);
		labal.add(cityfield);
		labal.add(provincefield);
		labal.add(nationalityfield);
	    labal.add(addressfield);
		labal.add(nextbutton);
		labal.add(backbutton);
	}
	
	public void setFont() {
		//nameLabel.setForeground(new Color(12,5,65));
		nameLabel.setForeground(Color.WHITE);
		nameLabel.setFont(new Font("Times New Roman",Font.BOLD,18));
		
		genderLabel.setForeground(Color.WHITE);
		genderLabel.setFont(new Font("Times New Roman",Font.BOLD,18));
		
		fathernameLabel.setForeground(Color.white);
		fathernameLabel.setFont(new Font("Times New Roman",Font.BOLD,18));
		
		surnameLabel.setForeground(Color.WHITE);
		surnameLabel.setFont(new Font("Times New Roman",Font.BOLD,18));
		
		Fatheroccupation.setForeground(Color.WHITE);
		Fatheroccupation.setFont(new Font("Times New Roman",Font.BOLD,18));
		
		MobileLabel.setForeground(Color.WHITE);
		MobileLabel.setFont(new Font("Times New Roman",Font.BOLD,18));
		
		FathermobileLabel.setForeground(Color.WHITE);
		FathermobileLabel.setFont(new Font("Times New Roman",Font.BOLD,18));
		
		DomicileLabel.setForeground(Color.WHITE);
		DomicileLabel.setFont(new Font("Times New Roman",Font.BOLD,18));
		
		CNICLabel.setForeground(Color.WHITE);
		CNICLabel.setFont(new Font("Times New Roman",Font.BOLD,18));
		
		DateOfBirthLabel.setForeground(Color.WHITE);
		DateOfBirthLabel.setFont(new Font("Times New Roman",Font.BOLD,18));
		
		emailLabel.setForeground(Color.WHITE);
		emailLabel.setFont(new Font("Times New Roman",Font.BOLD,18));
		
		cityLabel.setForeground(Color.WHITE);
		cityLabel.setFont(new Font("Times New Roman",Font.BOLD,18));
		
		provinceLabel.setForeground(Color.WHITE);
		provinceLabel.setFont(new Font("Times New Roman",Font.BOLD,18));
		
		NationalityLabel.setForeground(Color.WHITE);
		NationalityLabel.setFont(new Font("Times New Roman",Font.BOLD,18));
		
		addressLabel.setForeground(Color.WHITE);
		addressLabel.setFont(new Font("Times New Roman",Font.BOLD,18));
	}
	
	
		
	public void SetLocationandSize() {
		labal.setBounds(0, 0, 850, 670);
		
		nameLabel.setBounds(50,100,50,70);
		namefield.setBounds(190,123, 210, 18);
		
		genderLabel.setBounds(50,130,70,70);
		genderbox.setBounds(190, 153, 210, 18);
		
		fathernameLabel.setBounds(50, 140, 140, 100);
		fathernamefield.setBounds(190, 183, 210, 18);
		
		surnameLabel.setBounds(50, 170, 150, 100);
		surnamefield.setBounds(190, 213, 210, 18);
		
		Fatheroccupation.setBounds(50, 200, 150, 100);
		fatheroccupationfield.setBounds(190, 243,210,18);
		
		MobileLabel.setBounds(50, 230, 150,100);
		mobilefield.setBounds(190, 273, 210, 18);
		
		FathermobileLabel.setBounds(50, 260, 150, 100);
		fathermobilefield.setBounds(190, 303, 210,18);
		
		DomicileLabel.setBounds(50, 290, 150, 100);
		domicilefield.setBounds(190, 333, 210, 18);
		
		CNICLabel.setBounds(50, 320, 150, 100);
		cnicfield.setBounds(190, 363, 210, 18);
		
		DateOfBirthLabel.setBounds(50, 350, 150, 100);
		dobfield.setBounds(190,393,210,18);
		
		emailLabel.setBounds(50, 380, 150, 100);
		emailfield.setBounds(190,423 ,210, 18);
		
		
		cityLabel.setBounds(50, 410, 150, 100);
		cityfield.setBounds(190, 453, 210, 18);
		
		provinceLabel.setBounds(50, 440, 150, 100);
		provincefield.setBounds(190, 483, 210, 18);
		
		NationalityLabel.setBounds(50, 470, 150, 100);
		nationalityfield.setBounds(190, 513, 210,18);
		
		
		addressLabel.setBounds(50, 500, 150, 100);
		addressfield.setBounds(190,543 , 210, 18);
		
		
		nextbutton.setBounds(328, 584, 70, 20);
		nextbutton.setForeground(Color.black);	
		
		backbutton.setBounds(50, 584, 70, 20);
		backbutton.setForeground(Color.black);
	}
	
	
	public void Window() {
		jframe = new JFrame();
		jframe.setTitle("Personal Information");
		jframe.setBounds(40, 40, 460, 650);
		jframe.getContentPane().setBackground(null);
		jframe.getContentPane().setLayout(null);
		
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);
		jframe.setResizable(false);
		}
	
	public void MENUImage() {
		image = new ImageIcon(("C:\\Users\\Muhammad Uzair\\Downloads\\iba8.jpg"));
		labal = new JLabel();
		labal.setOpaque(true);
		labal.setIcon(image);
	}
	
	public void actionEvent() {
	   nextbutton.addActionListener(this);
		backbutton.addActionListener(this);
	}
	
	public void PersonalWindow() {
		
		MENUImage();
		Window();
		AddComponent();
		SetLocationandSize();
		setFont();
		actionEvent();
		
	}

   
 
  
 
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource()==nextbutton) {
			
			
				String name=namefield.getText();
   			 String father=fathernamefield.getText();
   			 String cnic = cnicfield.getText();
   			 String mail = emailfield.getText();
   			 String num1=mobilefield.getText();
   			 String num2=fathermobilefield.getText();
 
   			 
   			try {
   	        	Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/details","root","123456");
   	    		 Statement s = connection.createStatement();
   	    		 String q =  "select * from PD where Mobile_Number='"+num1+"'";

   	    		 ResultSet r = s.executeQuery(q);
   	    		 if(r.next()) {
   	    			 CNum1=true;
   	    		 }
   	    		 else {
   	    			 CNum1=false;
   	    		 }
   	        }catch(SQLException e1) {
   	        e1.printStackTrace(); 
   	        }  
   			
   			try {
   	        	Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/details","root","123456");
   	    		 Statement s = connection.createStatement();
   	    		 String q =  "select * from PD where CNIC='"+cnic+"'";

   	    		 ResultSet r = s.executeQuery(q);
   	    		 if(r.next()) {
   	    			 CCnic=true;
   	    		 }
   	    		 else {
   	    			 CCnic=false;
   	    		 }
   	        }catch(SQLException e1) {
   	        e1.printStackTrace(); 
   	        }
   	    	
   			try {
   	        	Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/details","root","123456");
   	    		 Statement s = connection.createStatement();
   	    		 String q =  "select * from PD where Email='"+mail+"'";

   	    		 ResultSet r = s.executeQuery(q);
   	    		 if(r.next()) {
   	    			 CEmail=true;
   	    		 }
   	    		 else {
   	    			 CEmail=false;
   	    		 }
   	        }catch(SQLException e1) {
   	        e1.printStackTrace(); 
   	        }  
   	    	
   			try {
   	        	Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/details","root","123456");
   	    		 Statement s = connection.createStatement();
   	    		 String q =  "select * from PD where Father_Number='"+num2+"'";

   	    		 ResultSet r = s.executeQuery(q);
   	    		 if(r.next()) {
   	    			 CNum2=true;
   	    		 }
   	    		 else {
   	    			 CNum2=false;
   	    		 }
   	        }catch(SQLException e1) {
   	        e1.printStackTrace(); 
   	        }
   			try {
   	    		
   	        	Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/details","root","123456");
   	        	Statement s=connection.createStatement();
   	    		
   	    		 
   	        	 String q =   "select * from PD where Name='"+name+"'and Father ='"+father+"'";
   	    		 ResultSet r = s.executeQuery(q);
   	    		 if(r.next())
   	    			  {	 
   	    			N_F=true; 
   	    		 
   	    		 }
   	    		 else {
   	    			 N_F=false;
   	    		 }
   	    

   	        }catch(SQLException e1) {
   	        e1.printStackTrace(); 
   	        }   
   
   	    	
                try {
				 Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/details","root","123456");
				 PreparedStatement PS=con.prepareStatement("insert into PD values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
				 PS.setString(1,namefield.getText());
				 PS.setString(2,fathernamefield.getText());
				 PS.setString(3,genderbox.getSelectedItem().toString());
				 PS.setString(4,surnamefield.getText());
				 PS.setString(5,fatheroccupationfield.getText());
				 PS.setString(6,mobilefield.getText());
				 PS.setString(7,fathermobilefield.getText());
				 PS.setString(8,domicilefield.getText());
				 PS.setString(9,cnicfield.getText());
				 PS.setString(10,dobfield.getText());
				 PS.setString(11,emailfield.getText());
				 PS.setString(12,cityfield.getText());
				 PS.setString(13,provincefield.getText());
				 PS.setString(14,nationalityfield.getText());
				 PS.setString(15,addressfield.getText());
                
				 
				     			 
    			 
				 if(namefield.getText().equals("")||fathernamefield.getText().equals("")||surnamefield.getText().equals("")||fatheroccupationfield.getText().equals("")||mobilefield.getText().equals("")||fathermobilefield.getText().equals("")||domicilefield.getText().equals("")||cnicfield.getText().equals("")||dobfield.getText().equals("")||emailfield.getText().equals("")||cityfield.getText().equals("")||provincefield.getText().equals("")||nationalityfield.getText().equals("")||addressfield.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "Error");
					}
					if((!(namefield.getText().equals(""))&&(!(fathernamefield.getText().equals(""))&&(!(surnamefield.getText().equals(""))&&(!(fatheroccupationfield.getText().equals(""))&&(!(mobilefield.getText().equals(""))&&(!(fathermobilefield.getText().equals(""))&&(!(domicilefield.getText().equals(""))&&(!(cnicfield.getText().equals(""))&&(!(dobfield.getText().equals(""))&&(!(emailfield.getText().equals(""))&&(!(cityfield.getText().equals(""))&&(!(provincefield.getText().equals("")&&(!(nationalityfield.getText().equals("")&&(!(addressfield.getText().equals(""))))))))))))))))))) {
					PS.executeUpdate();		
					EducationalDetails object = new EducationalDetails();
					object.EducationalWindow();
					jframe.dispose();
					}
                }catch(SQLException e1) {			
                	e1.printStackTrace();
                }
			
			
		if(e.getSource()==backbutton) {
			LoginWindow window = new LoginWindow();
			window.Login();
			jframe.dispose();
		}
		
	}
}
}
public class PersonalDetails {
	public static void main (String args[]) {
		PersonalInformation personalinfo = new PersonalInformation();
		personalinfo.PersonalWindow();
	}

}

