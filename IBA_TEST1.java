package Myproject;
import java.awt.Color;
import java.sql.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.*;
  class Test1 extends JFrame implements ActionListener{
	 JFrame f;
	 JPanel p;
	 JLabel ID = new JLabel("ID");
	 JLabel Password = new JLabel("Password");
	 JLabel Login = new JLabel("TEST   LOGIN");
	 JTextField f1 = new JTextField();
	 JPasswordField f2 = new JPasswordField();
	 JButton enter= new JButton("Enter");
	 JButton exit= new JButton("Exit");
	 ImageIcon TestImage;
	 JLabel ILabel;
  public void Menu() {
	  f = new JFrame();
	  //f.getContentPane().setBackground(Color.GRAY);
	  f.getContentPane().setLayout(null);
	  f.setBounds(220, 100, 1000, 430);
	  f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	  f.setVisible(true);
	  f.setResizable(false);
  }
  public void addComp() {
	  f.getContentPane().add(p);
	  f.add(Login);
	  f.add(ID);
	  f.add(f1);
	  f.add(enter);
	  f.add(exit);
	  p.add(ILabel);
  }
  public void setComp() {
	  ILabel.setBounds(0,0,600,400);
	    Login.setBounds(720, 30, 200, 100);
	    Login.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE,30)); 
	    Login.setForeground(Color.darkGray);
	    ID.setBounds(700, 150, 40, 70);
		f1.setBounds(770,170,165,23);
		enter.setBounds(730,300,80,25);
		enter.setBackground(Color.cyan);
		exit.setBounds(870,300,80,25);
		exit.setBackground(Color.cyan);
  }
  public void setImage() {
		TestImage = new ImageIcon("C:\\Users\\Muhammad Uzair\\Downloads\\iba15.jpg");
		ILabel = new JLabel(TestImage);
	}

  public void addPanel() {
	  p = new JPanel();
	  p.setBounds(0, -10,600 , 500);
	 
  }
  public void MarkAttempted(int id) {
	  try {
			 Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","123456");
			 PreparedStatement ps=con.prepareStatement("insert into quizd values(?,?)");
			 ps.setInt(1,id);
			 ps.setBoolean(2, true);
			 ps.executeUpdate();
		}
		catch(SQLException e1) {
			e1.printStackTrace();
		}
  }
  public boolean hasAttempted(int id) {
	  try {
		  Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","123456");
		  PreparedStatement st = con.prepareStatement("SELECT Attempted FROM quizd WHERE ID=?");
		  st.setInt(1, id);
		  ResultSet rs = st.executeQuery();
		  if(rs.next()) {
			  return rs.getBoolean("Attempted");
		  }
		  else {
			  return false;
		  }
	  }catch(SQLException e1) {
		  e1.printStackTrace();
		  return false;
	  }
	  
  }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		    if(e.getSource()==enter) {
			JOptionPane.showMessageDialog(null, Work.random);
			if(Integer.parseInt(f1.getText())==Work.random) {
				if(hasAttempted(Integer.parseInt(f1.getText()))) {
					JOptionPane.showMessageDialog(null, "You have attempted the Quiz");
				}
			else {
			MarkAttempted(Integer.parseInt(f1.getText()));
			
			Test2 obj = new Test2();
			obj.Launch();
			f.setVisible(false);
			}
				
		    }
			else {
			JOptionPane.showMessageDialog(null, "Wrong ID");
			}
		    }
		    }
	public void Test_Menu() {
		Menu();
		setImage();
		addPanel();
		addComp();
		setComp();	
		addAction();
	}
	public void addAction() {
		enter.addActionListener(this);
		exit.addActionListener(this);
	}
	 
 }
 class Test2 extends JFrame implements ActionListener{
	 JFrame J;
	 JButton start= new JButton("Start");
	 JButton back= new JButton("Back");
	 JLabel Wel = new JLabel("WELCOME       CANDIDATE");
	 JLabel rules = new JLabel("RULES");
	 
	 
	 String rule1 = "1 If you caught doing any unnecessory thing your test will be dismissed.";
	 String rule2 = "2 There will be neagative marking, on 4 wrong 1 extra mark will deducted.";
	 String rule3 = "3 First you have to complete Math potion then you can do English Portion.";
	 String rule4 = "4 There is alloted time for each Section.";
	 String rule5 = "5 Once you marked a answer and clicked next then you can not go back for recorrection.";
	 JLabel r1 = new JLabel(rule1);
	 JLabel r2 = new JLabel(rule2);
	 JLabel r3 = new JLabel(rule3);
	 JLabel r4 = new JLabel(rule4);
	 JLabel r5 = new JLabel(rule5);
	 
	 public void Menu() {
		 
		  J = new JFrame();
		  J.getContentPane().setLayout(null);
		  J.setBounds(220, 100, 700, 430);
		  J.setDefaultCloseOperation(J.EXIT_ON_CLOSE);
		  J.setVisible(true);
	  }
	 public void addC() {
		 J.add(Wel);
		 J.add(rules);
		 J.add(r1);
		 J.add(r2);
		 J.add(r3);
		 J.add(r4);
		 J.add(r5);
		 J.add(start);
		 J.add(back);
	 }
	 public void SetC() {
		 Wel.setBounds(50, 40, 550, 40);
		 Wel.setFont(new Font("Mongolian",Font.BOLD,40));
		 rules.setBounds(300,80,400,60);
		 rules.setFont(new Font("Mongolian",Font.BOLD,20));
		 r1.setBounds(50, 110,600,60);
		 r2.setBounds(50, 150,600,60);
		 r3.setBounds(50, 190,600,60);
		 r4.setBounds(50, 230,600,60);
		 r5.setBounds(50, 270,600,60);
		 start.setBounds(150, 330, 90, 23);
		 start.setBackground(Color.cyan);
		 back.setBounds(350,330,90,23);
		 back.setBackground(Color.cyan);
	 }
	 public void Launch() {
		 Menu();
		 addC();
		 SetC();
		 AddAction();
	 }
	 
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==start) {
			new Test3();
			J.setVisible(false);
		}
		if(e.getSource()==back) {
			Test1 obj = new Test1();
		    
		    obj.Test_Menu();
		    J.setVisible(false);
		}
		
	}
	public void AddAction() {
		start.addActionListener(this);
		back.addActionListener(this);
	}
	 
 }
 class Test3 extends JFrame implements ActionListener{
	    JFrame Testf;
	    JPanel Testp;
	    JLabel qno;
	    JLabel ques;
	    JButton next;
	    JButton submit;
	    JRadioButton rb1;
	    JRadioButton rb2;
	    JRadioButton rb3;
	    JRadioButton rb4;
	    ButtonGroup gb;
	    JLabel heading;
	    static int count=0;
	    int marks=0;
	    int wrong=0;
	    String[][] question = new String[25][5];
	    String[][] answer = new String[25][5];
	    String[][] useranswer = new String[25][1];
	  
		Test3(){
			
	      Testf = new JFrame();
	   	  Testf.getContentPane().setLayout(null);
	   	  Testf.setBounds(200, 100, 720, 500);
	   	  Testf.setDefaultCloseOperation(Testf.EXIT_ON_CLOSE);
	   	  
	   	  ImageIcon TestImage = new ImageIcon("C:\\Users\\Muhammad Uzair\\Downloads\\iba9.jpg");
	   	  JLabel TestI = new JLabel(TestImage);
	   	  
	   	  Testp = new JPanel();
	   	  Testp.setBounds(-48,-5,800,250);
	   	  Testf.add(Testp);
	   	  Testp.add(TestI);
	   	  TestI.setBounds(0,0,850,200);
	   	  
	   	  question[0][0]="What will come next in Series : 1,3,7,15,31,63,________";
	   	  question[0][1]="123";
	   	  question[0][2]="143";
	   	  question[0][3]="145";
	   	  question[0][4]="112";
	   	  
	   	  question[1][0]="A train 280 meter long , runnung with a speed of 63km/hr will pass a tree";
	 	  question[1][1]="16s";
	 	  question[1][2]="20s";
	 	  question[1][3]="22s";
	 	  question[1][4]="25s";
	 	  
	 	  question[2][0]="8 machines can do a piece of work in 10 days. How long it will take for 16 machines";
		  question[2][1]="7 days";
		  question[2][2]="5 days";
		  question[2][3]="6 days";
		  question[2][4]="8 dyas";
		  
		  question[3][0]="Akbar bought a sweater for RS 200 and sold Rs250. How much Akbar get the profit";
	 	  question[3][1]="Rs40";
	 	  question[3][2]="Rs20";
	 	  question[3][3]="Rs55";
	 	  question[3][4]="Rs50";
	 	  
	 	  question[4][0]="Sum of four consecutive numbers is 50.The least number is__";
		  question[4][1]="10";
		  question[4][2]="11";
		  question[4][3]="12";
		  question[4][4]="13";
		  
		  question[5][0]="The number,whose 13% is 52 is ___";
	 	  question[5][1]="300";
	 	  question[5][2]="400";
	 	  question[5][3]="500";
	 	  question[5][4]="900";
	 	  
	 	  question[6][0]="Which set is subset of every set";
		  question[6][1]="Disjoint";
		  question[6][2]="Null";
		  question[6][3]="Empty";
		  question[6][4]="both b&c";
		  
		  question[7][0]="A baskeball team won 18 out of 30 games played. what will be percenatage";
	 	  question[7][1]="60";
	 	  question[7][2]="40";
	 	  question[7][3]="43";
	 	  question[7][4]="27";
	 	  
	 	  question[8][0]="Find the angle between hour nad minute hand of clock when time is 3:25";
		  question[8][1]="47";
		  question[8][2]="45";
		  question[8][3]="44";
		  question[8][4]="43";
		  
		  question[9][0]="A man invests in 15% stock at Rs128. The interest Obtained by him is ";
	 	  question[9][1]="8%";
	 	  question[9][2]="12.5%";
	 	  question[9][3]="14.5%";
	 	  question[9][4]="15%";
	 	  
	 	  question[10][0]="Tanslate this passage ___ English";
		  question[10][1]="to";
		  question[10][2]="in";
		  question[10][3]="into";
		  question[10][4]="on";
		  
		  question[11][0]="Would you mind ____ a picture with you?";
	 	  question[11][1]="take";
	 	  question[11][2]="to take";
	 	  question[11][3]="taking";
	 	  question[11][4]="taken";
	 	  
	 	  question[12][0]="Thank you. That was ____ very nice dinner";
		  question[12][1]="an";
		  question[12][2]="a";
		  question[12][3]="the";
		  question[12][4]="none";
		  
		  question[13][0]="Synnoyms of Ridculous is _____";
	 	  question[13][1]="silly";
	 	  question[13][2]="Glorious";
	 	  question[13][3]="Awsome";
	 	  question[13][4]="none of these";
	 	  
	 	  question[14][0]="When I was sleeping, she ______ playing the sitar";
		  question[14][1]="Was";
		  question[14][2]="Must be";
		  question[14][3]="Were";
		  question[14][4]="is";
		  
		  question[15][0]="What is meaning of Banton";
	 	  question[15][1]="Afresh";
	 	  question[15][2]="Good manners";
	 	  question[15][3]="Farewell";
	 	  question[15][4]="Authority";
	 	  
	 	  question[16][0]="He writes ___ ink";
		  question[16][1]="with";
		  question[16][2]="in";
		  question[16][3]="to";
		  question[16][4]="on";
		  
		  question[17][0]="When the partition of bengal tiook place?";
	 	  question[17][1]="1918";
	 	  question[17][2]="1907";
	 	  question[17][3]="1906";
	 	  question[17][4]="1912";
	 	  
	 	  question[18][0]="Biggest desert of pakistan is";
		  question[18][1]="Thal";
		  question[18][2]="Thar";
		  question[18][3]="Cholistan";
		  question[18][4]="none";
		  
		  question[19][0]="Who was first elected prime  minister of Pakistan";
	 	  question[19][1]="Liaquat Ali Khan";
	 	  question[19][2]="Quaid e Azam";
	 	  question[19][3]="Zulifqar Ali Bhutto";
	 	  question[19][4]="Fatima jinnah";
	 	  
	 	  question[20][0]="What caliph is known for his bravery?";
		  question[20][1]="Hazrat Usman";
		  question[20][2]="Hazrat Ali";
		  question[20][3]="Hazrat Moosa";
		  question[20][4]="Hazrat Ismail";
		  
		  question[21][0]="Wo was the founder  of ottmon Empire?";
	 	  question[21][1]="Ertugul";
	 	  question[21][2]="Usman Gazi";
	 	  question[21][3]="Abdul Hamid";
	 	  question[21][4]="Murad";
	 	  
	 	  question[22][0]="Which number come next 1,3,6,10,15,__";
		  question[22][1]="17";
		  question[22][2]="21";
		  question[22][3]="23";
		  question[22][4]="20";
		  
		  question[23][0]="Which does not belong in apple,banana,carrot,orange group";
	 	  question[23][1]="Apple";
	 	  question[23][2]="Banana";
	 	  question[23][3]="Carrot";
	 	  question[23][4]="Orange";
	 	  
	 	  question[24][0]="Some months have 31 days,some have 30 days.How many months/month have 28days?";
		  question[24][1]="All";
		  question[24][2]="Febuaray";
		  question[24][3]="March";
		  question[24][4]="None";
		  
		  answer[0][1]="123";
		  answer[1][4]="25s";
		  answer[2][2]="5 days";
		  answer[3][4]="Rs50";
		  answer[4][2]="11";
		  answer[5][2]="400";
		  answer[6][2]="Null";
		  answer[7][1]="60";
		  answer[8][1]="47";
		  answer[9][1]="8%";
		  answer[10][3]="into";
		  answer[11][3]="taking";
		  answer[12][2]="a";
		  answer[13][1]="silly";
		  answer[14][1]="Was";
		  answer[15][2]="Good manners";
		  answer[16][2]="in";
		  answer[17][3]="1906";
		  answer[18][2]="Thar";
		  answer[19][3]="Zulifqar Ali Bhutto";
		  answer[20][2]="Hazrat Ali";
		  answer[21][2]="Usman Gazi";
		  answer[22][2]="21";
		  answer[23][3]="Carrot";
		  answer[24][1]="All";
		                            
		  heading = new JLabel("Mathematics");
		  heading.setBounds(330,250,250,20);
		  heading.setFont(new Font("viner ITC head",Font.BOLD,17));
		  Testf.add(heading);
		  
		  next = new JButton("Next");
		  next.setBounds(590, 320, 100, 20);
		  next.setBackground(Color.cyan);
		  Testf.add(next);
		  next.addActionListener(this);
		  
		  submit = new JButton("Submit");
		  submit.setBounds(590, 400, 100, 20);
		  submit.setBackground(Color.cyan);
		  submit.addActionListener(this);
		  submit.setEnabled(false);
		  Testf.add(submit);
		  
		  
		  ques = new JLabel();
		  ques.setBounds(60 ,280 , 700, 30);
		  ques.setFont(new Font("Viner had ITC",Font.BOLD,15));
		  Testf.add(ques);
		   
		  qno = new JLabel();
		  qno.setBounds(25,280,70,30);
		  qno.setFont(new Font("Viner had ITC",Font.BOLD,20));
		  Testf.add(qno);
		  
		  
		  
	   	  rb1 = new JRadioButton();
	   	  rb1.setBounds(50, 315, 400, 30);
	   	  rb1.setFont(new Font("Viner had ITC",Font.BOLD,17));
	   	  Testf.add(rb1);
	   	  
	   	  rb2 = new JRadioButton();
	   	  rb2.setBounds(50, 345, 400, 30);
	   	  rb2.setFont(new Font("Viner had ITC",Font.BOLD,17));
	      Testf.add(rb2);
	 	  
	 	  rb3 = new JRadioButton();
	 	  rb3.setBounds(50, 380, 400, 30);
	 	  rb3.setFont(new Font("Viner had ITC",Font.BOLD,17));
	 	  Testf.add(rb3);
	  	  
	 	  rb4 = new JRadioButton();
	 	  rb4.setBounds(50, 410, 400, 30);
	 	  rb4.setFont(new Font("Viner had ITC",Font.BOLD,17));
	 	  Testf.add(rb4);
	 	  
	 	  gb = new ButtonGroup();
	 	  gb.add(rb1);
	  	  gb.add(rb2);
	 	  gb.add(rb3);
	  	  gb.add(rb4);
	  	  
	  	  Start(count);
	 	 Testf.setVisible(true);
	  	
	 	  
	     }
		@Override
		public void actionPerformed(ActionEvent e) {
			if(gb.getSelection()==null) {
				useranswer[count][0]=" ";
			}
			else {
				useranswer[count][0]=gb.getSelection().getActionCommand();
			}
			
			if(e.getSource()==next) {
				count++;
				Start(count);
			    }
			    if(count==10) {
			    	heading.setText("English");
			    }
			    if(count==17) {
			    	heading.setText("Generl Knowledge");
			    }
			    if(count==22) {
			    	heading.setText("IQ");
			    }
				if(count==24) {
				submit.setEnabled(true);
				next.setEnabled(false);
		        }
			    
				if(e.getSource()==submit) {
				//c=calculate_marks()
					for(int i=0;i<25;i++) {
						for(int j=1;j<=4;j++) {
							if((useranswer[i][0]!=null)&&(answer[i][j]==(useranswer[i][0]))) {
								marks++;
							}
						}
					}
					
	               // int result = marks-(wrong/4);
					if(marks<12) {
						new Score("Better Luck Next Time","You have not cleared the Test","Your Score is " + marks);
						Menu obj = new Menu();
						obj.Start();
					}
					else{
						new Score("Congratulations","You have  cleared the Test","Your Score is " + marks);
						Menu obj = new Menu();
						obj.Start();
					}
				}
			   
			
		
		}


		public void Start(int count) {
			qno.setText(" " + (count+1) + ".");
			ques.setText(question[count][0]);
			rb1.setText(question[count][1]);
			rb1.setActionCommand(question[count][1]);
		    rb2.setText(question[count][2]);
		    rb2.setActionCommand(question[count][2]);
			rb3.setText(question[count][3]);
			rb3.setActionCommand(question[count][3]);
			rb4.setText(question[count][4]);
			rb4.setActionCommand(question[count][4]);
			gb.clearSelection();
		}
		
	}
	class Score{
		JFrame Sframe;
		JLabel l1;
		JLabel l2;
		JLabel l3;
		Score(String s1,String s2,String s3){
		Sframe = new JFrame();
	 	  Sframe.getContentPane().setLayout(null);
	 	  Sframe.setBounds(200, 100, 900, 400);
	 	  Sframe.setDefaultCloseOperation(Sframe.EXIT_ON_CLOSE);
	 	  
	 	  l1 = new JLabel(s1);
	 	  l1.setBounds(150,-150,800,400);
	 	  l1.setFont(new Font("Times New Roman",Font.BOLD,45));
	 	  l1.setForeground(Color.BLUE);
	 	  Sframe.add(l1);
	 	  l2 = new JLabel(s2);
		  l2.setBounds(100,-50,800,400);
		  l2.setFont(new Font("Times New Roman",Font.BOLD,40));
		  l2.setForeground(Color.BLUE);
		  Sframe.add(l2);
		  l3 = new JLabel(s3);
		  l3.setBounds(150,50,800,400);
		  l3.setFont(new Font("Times New Roman",Font.BOLD,40));
		  l3.setForeground(Color.BLUE);
		  Sframe.add(l3);
	 	  Sframe.setVisible(true);
	 	  
		}
	}
public class IBA_TEST1 {
	

	public static void main(String[] args) {
	}

}
