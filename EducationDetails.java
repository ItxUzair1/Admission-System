package Myproject;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.*;


class EducationalDetails implements ActionListener {
	JFrame frame;
	static int obtained=0;
	static int total=0;
	static float percentageMatric=0f;
	static float percentageHSC=0f;
	
	String[] years = {"2022","2021","2020","2019"};
	JComboBox Box1 = new JComboBox(years);
	JComboBox Box2 = new JComboBox(years);
	JComboBox Box3 = new JComboBox(years);
	
	JButton next2button = new JButton("Next");
	JButton back2button = new JButton("Back");
	
	
	JLabel DegreeLabel = new JLabel("Degree/Certificate");
	JLabel MatricLabel = new JLabel("Matric (X)");
	JLabel HSSCLabel = new JLabel("HSSC-(XII)");
	JLabel otherLabel = new JLabel("other");
	JLabel MarksObtainedLabel = new JLabel("Marks Obtained");
	JLabel TotalMarksLabel = new JLabel("Total Marks");
	JLabel GradeLabel = new JLabel("Percentage/Grade");
	JLabel PassingYearLabel = new JLabel("Passing Year");
	JLabel BoardLabel = new JLabel("Board");
	JLabel CollegeLabel = new JLabel("School/College/University Name");
	
	
	JTextField Matricobtained = new JTextField();
	JTextField Matrictotal = new JTextField();
	JTextField MatricPercentage = new JTextField();
	JTextField MatricPassingYear = new JTextField();
	JTextField MatricBoard = new JTextField();
	JTextField MatricCollege = new JTextField();
	JTextField HSSCobtained = new JTextField();
	JTextField HSSCtotal = new JTextField();
	JTextField HSSCPercentage = new JTextField();
	JTextField HSSCPassingYear = new JTextField();
	JTextField HSSCBoard = new JTextField();
	JTextField HSSCCollege = new JTextField();
	JTextField otherobtained = new JTextField();
	JTextField othertotal = new JTextField();
	JTextField otherPercentage = new JTextField();
	JTextField otherPassingYear = new JTextField();
	JTextField otherBoard = new JTextField();
	JTextField otherCollege = new JTextField();
	
	
	public void AddComp() {
		frame.add(Matricobtained);
		frame.add(Matrictotal);
		frame.add(MatricPercentage);
		frame.add(MatricPassingYear);
		frame.add(MatricBoard);
	    frame.add(MatricCollege);
	    
	    frame.add(HSSCobtained);
	    frame.add(HSSCtotal);
	    frame.add(HSSCPassingYear);
	    frame.add(HSSCBoard);
	    frame.add(HSSCCollege);
	    frame.add(HSSCPercentage);
	    
	    frame.add(othertotal);
	    frame.add(otherBoard);
	    frame.add(otherobtained);
	    frame.add(otherPercentage);
	    frame.add(otherPassingYear);
	    frame.add(otherCollege);
	    
	    frame.add(Box1);
	    frame.add(Box2);
	    frame.add(Box3);
	    
	    frame.add(BoardLabel);
	    frame.add(CollegeLabel);
	    frame.add(DegreeLabel);
	    frame.add(MarksObtainedLabel);
	    frame.add(TotalMarksLabel);
	    frame.add(otherLabel);
	    frame.add(GradeLabel);
	    frame.add(HSSCLabel);
	    frame.add(MatricLabel);
	    frame.add(PassingYearLabel);
	    
	    frame.add(next2button);
	    frame.add(back2button);
	}
	
	public void SetLabelAndtext() {
		
		
		
		DegreeLabel.setBounds(20, 100, 150, 30);
		MatricLabel.setBounds(20, 150, 150, 30);
		HSSCLabel.setBounds(20,  200, 150,30);
		otherLabel.setBounds(20, 250, 150, 30);
		
		MarksObtainedLabel.setBounds(150, 100, 150, 30);
		Matricobtained.setBounds(150, 160, 70, 17);
		HSSCobtained.setBounds(150, 207, 70, 17);
		otherobtained.setBounds(150, 255, 70, 17);
		
		back2button.setBounds(150, 300,70, 30);
		back2button.setForeground(Color.black);
		
		TotalMarksLabel.setBounds(260, 100, 150, 30);
		Matrictotal.setBounds(260, 160, 70, 17);
		HSSCtotal.setBounds(260, 207, 70, 17);
		othertotal.setBounds(260, 255, 70, 17);
		
		GradeLabel.setBounds(370, 100, 150, 30);
		MatricPercentage.setBounds(370, 160, 105, 17);
		HSSCPercentage.setBounds(370, 207, 105, 17);
		otherPercentage.setBounds(370, 255, 105, 17);
		
		PassingYearLabel.setBounds(500, 100, 100, 30);
		Box1.setBounds(500, 160, 70, 17);
		Box2.setBounds(500, 207, 70, 17);
		Box3.setBounds(500, 255, 70, 17);
		
		BoardLabel.setBounds(620, 100, 100, 30);
		MatricBoard.setBounds(600, 160, 80, 17);
		HSSCBoard.setBounds(600, 207, 80, 17);
		otherBoard.setBounds(600, 255, 80, 17);
		
		
		CollegeLabel.setBounds(710, 100, 200, 30);
		MatricCollege.setBounds(710, 160, 250, 17);
		HSSCCollege.setBounds(710, 207, 250, 17);
		otherCollege.setBounds(710, 255, 250, 17);
		
		next2button.setBounds(710, 300,70, 30);
		next2button.setForeground(Color.black);
	}   
	
	
	public void Window2() {
		frame = new JFrame();
		frame.setTitle("Personal Information");
		frame.setBounds(60, 60, 1000, 450);
		frame.getContentPane().setBackground(null);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);	
		}
	public void ActionEvents() {
	 	   next2button.addActionListener(this);
	 		back2button.addActionListener(this);
	 	}
	
	    public void EducationalWindow(){
	    	Window2();
	     	AddComp();
	     	SetLabelAndtext();
	     	ActionEvents();
	    }
	    
	
	    
	    
	    
	    
  public void actionPerformed(ActionEvent e) {
//	
		if(e.getSource()==back2button) {
			
			PersonalInformation personalinfo = new PersonalInformation();
			frame.dispose();
			personalinfo.PersonalWindow();
		}
		if(e.getSource()==next2button) {
			
			try {
				 Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/details","root","123456");
				PreparedStatement ps = con.prepareStatement("insert into ED values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
				ps.setString(1,  Matricobtained.getText());
				ps.setString(2,  Matrictotal.getText());
				ps.setString(3,  MatricPercentage.getText());
				ps.setString(4,  Box1.getSelectedItem().toString());
				ps.setString(5,  MatricBoard.getText());
				ps.setString(6,  MatricCollege.getText());
				ps.setString(7,  HSSCobtained.getText());
				ps.setString(8,  HSSCtotal.getText());
				ps.setString(9,  HSSCPercentage.getText());
				ps.setString(10, Box2.getSelectedItem().toString());
				ps.setString(11, HSSCBoard.getText());
				ps.setString(12, HSSCCollege.getText());
				ps.setString(13, otherobtained.getText());
				ps.setString(14, othertotal.getText());
				ps.setString(15, otherPercentage.getText());
				ps.setString(16, Box3.getSelectedItem().toString());
				ps.setString(17, otherBoard.getText());
				ps.setString(18, otherCollege.getText());
				obtained=Integer.parseInt(Matricobtained.getText());
				total=Integer.parseInt(Matrictotal.getText());
				percentageMatric = (obtained*100)/total;
				obtained=Integer.parseInt(HSSCobtained.getText());
				total=Integer.parseInt(HSSCtotal.getText());
				percentageHSC = (obtained*100)/total;
				if(Matricobtained.getText().equals("")||Matrictotal.getText().equals("")||MatricPercentage.getText().equals("")||MatricBoard.getText().equals("")||MatricCollege.getText().equals("")|| HSSCobtained.getText().equals("")||HSSCtotal.getText().equals("")||HSSCPercentage.getText().equals("")||HSSCBoard.getText().equals("")||HSSCCollege.getText().equals("")) {
		            JOptionPane.showMessageDialog(null, "Error");				
					}
				if((!(Matricobtained.getText().equals(""))&&(!(Matrictotal.getText().equals(""))&&(!(MatricPercentage.getText().equals(""))&&(!(MatricBoard.getText().equals(""))&&(!(MatricCollege.getText().equals(""))&&(!(HSSCobtained.getText().equals(""))&&(!(HSSCtotal.getText().equals(""))&&(!(HSSCPercentage.getText().equals(""))&&(!(HSSCBoard.getText().equals(""))&&(!(HSSCCollege.getText().equals(""))))))))))))) {
						ps.executeUpdate();
						Program program = new Program();
						frame.dispose();
						program.Method();	
					}
			}catch(SQLException e1) {
				e1.printStackTrace();
			}
			
		}
	}
}
class Program implements ActionListener{
	JFrame frame2;
	
	String[] programs = {"BBA","Computer Science","Software Engineering","BS Mathematics"};
	String [] campus = {"Main IBA Sukkur Camous","IBA khairpur campus","Dadu Campus","Mirpurkhas Campus","Khandkot Campus"};
	JComboBox box3 = new JComboBox(programs);
	JComboBox box4 = new JComboBox(campus);
	
	JButton next3button = new JButton("Next");
	JButton back3button = new JButton("Back");
	
	
	JLabel programlabel = new JLabel("Select Programs");
	JLabel campuslabel = new JLabel("Select Campus");
	
	public void Addcomp(){
		frame2.add(programlabel);
		frame2.add(campuslabel);
		frame2.add(next3button);
		frame2.add(back3button);
		frame2.add(box3);
		frame2.add(box4);
	}

	public void setBound() {
		
		programlabel.setBounds(50,85 ,160, 30);
		box3.setBounds(50,120 , 299,30);
		
		campuslabel.setBounds(50, 170, 160, 30);
		box4.setBounds(50, 200, 299, 30);
		
		back3button.setBounds(50, 280, 70, 30);
		next3button.setBounds(280, 280, 70, 30);
		
	}
	
	public void Window3() {
		frame2 = new JFrame();
		frame2.setTitle("Select Program");
		frame2.setBounds(60, 60, 550, 400);
		frame2.getContentPane().setBackground(null);
		frame2.getContentPane().setLayout(null);
		
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setVisible(true);
		frame2.setResizable(false);	
		}
	
	 public void Method() {
		 Window3();
		 setBound();
		 Addcomp();
		 Action();
		
	 }
	 public void Action() {
	 	   next3button.addActionListener(this);
	 		back3button.addActionListener(this);
	 	}
	
	 
	public void actionPerformed(ActionEvent e){
	   
	   if(e.getSource()==next3button) {
		   try {
			   Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Details","root","123456");
			   PreparedStatement ps = con.prepareStatement("insert into PRD values(?,?)");
			   ps.setString(1, box3.getSelectedItem().toString());
			   ps.setString(2, box4.getSelectedItem().toString());
			   ps.executeUpdate();
			   JOptionPane.showMessageDialog(null, "Sucess");
		   }catch(SQLException e1) {
			   
		   }
		   new Work();
	   }
	   if(e.getSource()==back3button) {
		   EducationalDetails details = new EducationalDetails();
		   frame2.dispose();
		   details.EducationalWindow();
	   }
	   
		
		
	}
	
}

public class EducationDetails{	
   public static void main (String args[]) {
	   
   }
	
}
