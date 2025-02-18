package bankmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
public class Signuptwo extends JFrame implements ActionListener{
    
    
    JTextField pantextfield,aadhartextfield;
    
    JRadioButton syes,sno,eyes,eno;
    JButton next;
    JComboBox religion,category,income,education,occupation;
    String formno;
    Signuptwo(String formno)
    {
        this.formno=formno;
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM: PAGE 2");
        
        
        JLabel additionaldetails=new JLabel("page 1:Additional details");
        additionaldetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionaldetails.setBounds(290,80,400,30);
        add(additionaldetails);
        
        JLabel name=new JLabel("Religion:");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
        String valReligion[]={"Hindu","Muslim","Christian","marati","other"};
        religion=new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        JLabel fname=new JLabel("Category:");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,100,30);
        add(fname);
        
        String valCategory[]={"General","OBC","SC","ST","Other"};
        category=new JComboBox(valCategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);
        
     
        JLabel gender=new JLabel("Income:");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,240,200,30);
        add(gender);
        
        String valincome[]={"NULL","<1,50,000","<2,50,000","<5,00,000","Other"};
        income=new JComboBox(valincome);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.WHITE);
        add(income);
        
        
        JLabel email=new JLabel("Qualification:");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,290,200,30);
        add(email);
        
        
        String valeducation[]={"under-graduate","graduate","Other"};
        education=new JComboBox(valeducation);
        education.setBounds(300,290,400,30);
        education.setBackground(Color.WHITE);
        add(education);
        
        
        JLabel marital=new JLabel("Occupation:");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,340,200,30);
        add(marital);
        
        String valqualification[]={"slaried","unemployed","student" ,"Other"};
        occupation=new JComboBox(valqualification);
        occupation.setBounds(300,340,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
        
        JLabel address=new JLabel("PAN Number:");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);
        
        
        
        pantextfield=new JTextField();
        pantextfield.setFont(new Font("Raleway",Font.BOLD,14));
        pantextfield.setBounds(300,440,400,30);
        add(pantextfield);
        
        
        
       
        
        JLabel state=new JLabel("Aadhar Number:");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,490,200,30);
        add(state);
        
        aadhartextfield=new JTextField();
        aadhartextfield.setFont(new Font("Raleway",Font.BOLD,14));
        aadhartextfield.setBounds(300,490,400,30);
        add(aadhartextfield);
        
        JLabel pincode=new JLabel("Senior Citizen:");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,530,200,30);
        add(pincode);
        
        
        
        syes=new JRadioButton("Yes");
        syes.setBounds(300,530,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno=new JRadioButton("No");
        sno.setBounds(450,530,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup setizengroup=new ButtonGroup();
        setizengroup.add(syes);
        setizengroup.add(sno);
        
        
        JLabel exist=new JLabel("Existing Account:");
        exist.setFont(new Font("Raleway",Font.BOLD,20));
        exist.setBounds(100,590,200,30);
        add(exist);
        
        eyes=new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno=new JRadioButton("No");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup existgroup=new ButtonGroup();
        existgroup.add(eyes);
        existgroup.add(eno);
        
        
        
        next=new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        
        
        
        
        
        
        
    }
    public void actionPerformed(ActionEvent ae)
    {
    
     String sreligion=(String)religion.getSelectedItem();
     String scategory=(String)category.getSelectedItem();
     String sincome=(String)income.getSelectedItem();
     String seducation=(String)education.getSelectedItem();
     String soccupation=(String)occupation.getSelectedItem();
     String seniorcitizen=null;
     if(syes.isSelected())
     {
         seniorcitizen="Yes";
     }
     else if(sno.isSelected())
     {
         seniorcitizen="No";
     }
     
     String existingaccount=null;
     if(eyes.isSelected())
     {
         existingaccount="Yes";
     }
     else if(eno.isSelected())
     {
         existingaccount="No";
     }
     
     String span=pantextfield.getText();
     String saadhar=aadhartextfield.getText();
     
     
     try{
      
           Conn c=new Conn();
           String query="insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"
                   + span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
                
                  c.s.executeUpdate(query);
                  setVisible(false);
                  new Signupthree(formno).setVisible(true);
                  
       }
     
     catch(Exception e)
     {
         System.out.println(e);
     }
     
    }
    
    public static void main(String args[])
    {
        new Signuptwo("");
    }
}
