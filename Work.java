package Myproject;
import java.awt.Color;
import java.util.*;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.sql.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.font.*;
import java.awt.image.BufferedImage;

 class Work extends JFrame implements ActionListener{
	 static int n=0;
	 static int random=0;
    JButton Pbutton ;
    JButton finish;
    JLabel Passport;
    JLabel Plabel;
    
    JButton Cbutton;
    JLabel Cnic;
    JLabel Clabel;
    
    JButton Mbutton;
    JLabel Matric;
    JLabel Mlabel;
    
    JButton Ibutton;
    JLabel Inter;
    JLabel Ilabel;
 
    
    public Work(){
    	
   
    Pbutton = new JButton("Browse");
    finish = new JButton("Finish");
    Plabel = new JLabel();
    Passport = new JLabel("1. Insert the passport size Photo");
    Passport.setFont(new Font("Times New Roman",Font.BOLD,18));
    Passport.setBounds(25, 40, 350, 100);
    Pbutton.setBounds(400,75,100,30);
    Plabel.setBounds(550,40,120,120); 
    finish.setBounds(450,500,100,40);
    finish.addActionListener(this);
    this.add(finish);
    this.add(Plabel);
    this.add(Passport);
    this.add(Pbutton);
     
     Cbutton = new JButton("Browse");
     Clabel = new JLabel();
     Cnic = new JLabel("2. Insert the CNIC");
     Cnic.setFont(new Font("Times New Roman",Font.BOLD,18));
     Cnic.setBounds(25, 150, 350, 100);
     Cbutton.setBounds(400, 187, 100, 30);
     Clabel.setBounds(550, 150, 120, 120);
     this.add(Clabel);
     this.add(Cnic);
     this.add(Cbutton);
     
     Mbutton = new JButton("Browse");
     Mlabel = new JLabel();
     Matric = new JLabel("3. Insert the Matric Marksheet");
     Matric.setFont(new Font("Times New Roman",Font.BOLD,18));
     Matric.setBounds(25, 260, 350, 100);
     Mbutton.setBounds(400, 299, 100, 30);
     Mlabel.setBounds(550, 260, 120, 120);
     this.add(Mlabel);
     this.add(Matric);
     this.add(Mbutton);
     
     Ibutton = new JButton("Browse");
     Ilabel = new JLabel();
     Inter = new JLabel("4. Insert the Intermediate Marksheet");
     Inter.setFont(new Font("Times New Roman",Font.BOLD,18));
     Inter.setBounds(25, 370, 350, 100);
     Ibutton.setBounds(400, 411, 100, 30);
     Ilabel.setBounds(550, 370, 120, 120);
     this.add(Ilabel);
     this.add(Inter);
     this.add(Ibutton);
     
     Ibutton.addActionListener(new ActionListener() {

         public void actionPerformed(ActionEvent e) {
         
           JFileChooser file = new JFileChooser();
           file.setCurrentDirectory(new File(System.getProperty("user.home")));
           //filter the files
           FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg","gif","png");
           file.addChoosableFileFilter(filter);
           int result = file.showSaveDialog(null);
            //if the user click on save in Jfilechooser
           if(result == JFileChooser.APPROVE_OPTION){
               File selectedFile = file.getSelectedFile();
               String path = selectedFile.getAbsolutePath();
               Ilabel.setIcon(ResizeImage(path));
               try {
   				Image(selectedFile);
   			} catch (FileNotFoundException e1) {
   				// TODO Auto-generated catch block
   				e1.printStackTrace();
   			} catch (IOException e1) {
   				// TODO Auto-generated catch block
   				e1.printStackTrace();
   			}
           }
            //if the user click on save in Jfilechooser


           else if(result == JFileChooser.CANCEL_OPTION){
               System.out.println("No File Select");
           }
           
         }
     });

     
     Mbutton.addActionListener(new ActionListener() {

         public void actionPerformed(ActionEvent e) {
         
           JFileChooser file = new JFileChooser();
           file.setCurrentDirectory(new File(System.getProperty("user.home")));
           //filter the files
           FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg","gif","png");
           file.addChoosableFileFilter(filter);
           int result = file.showSaveDialog(null);
            //if the user click on save in Jfilechooser
           if(result == JFileChooser.APPROVE_OPTION){
               File selectedFile = file.getSelectedFile();
               String path = selectedFile.getAbsolutePath();
               Mlabel.setIcon(ResizeImage(path));
               try {
   				Image(selectedFile);
   			} catch (FileNotFoundException e1) {
   				// TODO Auto-generated catch block
   				e1.printStackTrace();
   			} catch (IOException e1) {
   				// TODO Auto-generated catch block
   				e1.printStackTrace();
   			}
           }
            //if the user click on save in Jfilechooser


           else if(result == JFileChooser.CANCEL_OPTION){
               System.out.println("No File Select");
           }
           
         }
     });

     
     Cbutton.addActionListener(new ActionListener() {

         public void actionPerformed(ActionEvent e) {
         
           JFileChooser file = new JFileChooser();
           file.setCurrentDirectory(new File(System.getProperty("user.home")));
           //filter the files
           FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg","gif","png");
           file.addChoosableFileFilter(filter);
           int result = file.showSaveDialog(null);
            //if the user click on save in Jfilechooser
           if(result == JFileChooser.APPROVE_OPTION){
               File selectedFile = file.getSelectedFile();
               String path = selectedFile.getAbsolutePath();
               Clabel.setIcon(ResizeImage(path));
               try {
   				Image(selectedFile);
   			} catch (FileNotFoundException e1) {
   				// TODO Auto-generated catch block
   				e1.printStackTrace();
   			} catch (IOException e1) {
   				// TODO Auto-generated catch block
   				e1.printStackTrace();
   			}
           }
            //if the user click on save in Jfilechooser


           else if(result == JFileChooser.CANCEL_OPTION){
               System.out.println("No File Select");
           }
           
         }
     });
  
    Pbutton.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e) {
        
          JFileChooser file = new JFileChooser();
          file.setCurrentDirectory(new File(System.getProperty("user.home")));
          //filter the files
          FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg","gif","png");
          file.addChoosableFileFilter(filter);
          int result = file.showSaveDialog(null);
           //if the user click on save in Jfilechooser
          if(result == JFileChooser.APPROVE_OPTION){
              File selectedFile = file.getSelectedFile();
              String path = selectedFile.getAbsolutePath();
              Plabel.setIcon(ResizeImage(path));
               try {
				Image(selectedFile);
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
          }
           //if the user click on save in Jfilechooser


          else if(result == JFileChooser.CANCEL_OPTION){
              System.out.println("No File Select");
          }
          
        }
    });
    
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setSize(750,600);
    setVisible(true);
    } 
    public void Image(File ImageFile) throws FileNotFoundException, IOException {
    	
 
    	try{
    		n++;
    		BufferedImage image = ImageIO.read(ImageFile);
    		ByteArrayOutputStream b = new ByteArrayOutputStream();
    		ImageIO.write(image, "jpg", b);
    		byte[] imageData = b.toByteArray();
    		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/image","root","123456");
			PreparedStatement S = connection.prepareStatement("insert into pics values(?,?,?,?)");
			S.setBytes(n, imageData);
			S.executeUpdate();
			JOptionPane.showMessageDialog(null, "Success");
    }catch(SQLException e1) {
    	e1.printStackTrace();
    }
    }
     
     // Method to resize imageIcon with the same size of a Jlabel
    public ImageIcon ResizeImage(String ImagePath)
    {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(Plabel.getWidth(), Plabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    
    public ImageIcon ResizeImage2(String ImagePath)
    {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(Clabel.getWidth(), Clabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    public ImageIcon ResizeImage3(String ImagePath)
    {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(Mlabel.getWidth(), Mlabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    public ImageIcon ResizeImage4(String ImagePath)
    {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(Ilabel.getWidth(), Ilabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
  
    
    public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
    	 PersonalInformation obj = new PersonalInformation();
    	 EducationalDetails obj2 = new EducationalDetails();
   			LoginWindow obj3 = new LoginWindow();
   			String em= obj3.mail;
   			
		 if(e.getSource()==finish) {
			 JOptionPane.showMessageDialog(null, em);
			if(obj.CNum1||obj.CNum2||obj.CEmail||obj.CCnic||obj.N_F||(obj2.percentageHSC<50f)||(obj2.percentageMatric<50f)) {
	        JOptionPane.showMessageDialog(null, "Your Form has been disapproved");
	        try {
				 Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/CheckForm","root","123456");
				 PreparedStatement ps = con.prepareStatement("insert into Form values(?,?)");
				 ps.setString(1,em );
				 ps.setBoolean(2, false);
				 ps.executeUpdate();
			}catch(SQLException e1) {
				e1.printStackTrace();
			}
			}
			else {
			JOptionPane.showMessageDialog(null, "Your Form has been approved");
			try {
				 Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/CheckForm","root","123456");
				 PreparedStatement ps = con.prepareStatement("insert into Form values(?,?)");
				 ps.setString(1,obj3.mail );
				 ps.setBoolean(2, true);
				 ps.executeUpdate();
			}catch(SQLException e1) {
				e1.printStackTrace();
			}
			Random ob = new Random();
			random = ob.nextInt(10000);
			JOptionPane.showMessageDialog(null, "Your ID for Quiz is " + random);
			Menu ob2 = new Menu();
			ob2.Start();
			}
		}
	
		
	}



    
    public static void main(String[] args){

    }
    
   }