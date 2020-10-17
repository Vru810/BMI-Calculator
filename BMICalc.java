import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

/**This is the code that shows the features which include the panels, textfields, and buttons in the main frame
   This code does include the implementation of the ActionListener to the BMIClac class as of now.
   */

public class BMICalc{
    private JTextField t2;
    private JTextField t1;
    private JTextField t3;
    private JTextField t4;
    private JTextField t5;
    private JTextField t6;
    private JLabel bmi;
    private JLabel whRatio;
    private JLabel bpf;
    private JLabel lbm;
    private JLabel first;
    private JLabel second;
    private JRadioButton female, male;
  
  public BMICalc(){
   
   JFrame frame = new JFrame("BMI Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,800);
        
        
        //Height portion
        JLabel Height = new JLabel ("Height: ");
        t1 = new JTextField(7);
        JLabel Feet = new JLabel("feet");
        t6 = new JTextField(7);
        JLabel Inches = new JLabel("inches");
        
        //Weight portion
        JLabel Weight = new JLabel("Weight: ");
        t2 = new JTextField(7);        
        JLabel pounds = new JLabel("pounds");
        
        //Waist portion 
        JLabel Waist = new JLabel("Waist: ");
        t3 = new JTextField(7);
        JLabel I2 = new JLabel("inches");
        
        //Neck portion
        JLabel Neck = new JLabel("Neck: ");
        t4 = new JTextField(7);
        JLabel I3 = new JLabel("inches");
        
        //Hips portion
        JLabel Hips = new JLabel("Hips: ");
        t5 = new JTextField(7);
        JLabel I4 = new JLabel("inches");

   
        //creating the base panel and setting its layout
        JPanel base = new JPanel();
        base.setLayout(new BoxLayout(base, BoxLayout.Y_AXIS));
        
        //panel for the Height
        JPanel panel1 = new JPanel(new FlowLayout());
        panel1.add(Height);
        panel1.add(t1);
        panel1.add(Feet);
        panel1.add(t6);
        panel1.add(Inches);
        
        //panel for the Weight
        JPanel panel2 = new JPanel(new FlowLayout());
        panel2.add(Weight);
        panel2.add(t2);
        panel2.add(pounds); 
       
        //Panel for the Waist
        JPanel panel3 = new JPanel(new FlowLayout());
        panel3.add(Waist);
        panel3.add(t3);
        panel3.add(I2);
        
        //Panel for the Neck
        JPanel panel4 = new JPanel(new FlowLayout());
        panel4.add(Neck);
        panel4.add(t4);
        panel4.add(I3);
        
        //Panel for the Hips
        JPanel panel5 = new JPanel(new FlowLayout());
        panel5.add(Hips);
        panel5.add(t5);
        panel5.add(I4);
        
        //Adding everything to the base
        frame.add(base); 
        base.add(panel1);
        base.add(panel2);
        base.add(panel3);
        base.add(panel4);
        base.add(panel5);
        
       //creating labels and butttons for the gender
        JLabel s = new JLabel("Gender: ");
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        
        //creating new pannel for the buttons and adding to it
        JPanel base2 = new JPanel();
        base2.setLayout(new FlowLayout());
        base2.add(s);
        base2.add(male);
        //male.addActionListener(this);
        base2.add(female);
        //female.addActionListener(this);
        base.add(base2);
        
        //Grouping the radiobuttons
        ButtonGroup group1 = new ButtonGroup();
        group1.add(male);
        group1.add(female);
        
        //creates the label and the buttons for the activity type
        JLabel Loa = new JLabel("Level of Activity: ");
        JRadioButton sedentary = new JRadioButton("sedentary");
        JRadioButton moderate = new JRadioButton("moderate");
        JRadioButton active = new JRadioButton("active");
        
        //This groups the buttons
        ButtonGroup group2 = new ButtonGroup();
        group2.add(sedentary);
        group2.add(moderate);
        group2.add(active);
        
        //A panel that adds the buttons to the base
        JPanel panel6 = new JPanel();
        panel6.setLayout(new BoxLayout(panel6, BoxLayout.Y_AXIS));
        base.add(Loa);
        base.add(sedentary);
        base.add(moderate);
        base.add(active);
        
        
        
        //This base adds the panel to it and itself to the main base
        JPanel base3 = new JPanel();
        base3.setLayout(new FlowLayout());
        //base3.add(Loa);
        base3.add(panel6); 
        base.add(base3);
        
        
        //creates buttons for clear and calculate 
        JButton clear = new JButton("Clear");
        JButton calculate = new JButton("Calculate");
        
        //Groups these buttons
        ButtonGroup group3 = new ButtonGroup();
        group3.add(clear);
        group3.add(calculate);
        
        //Creates new panel and adds the buttons the the panel and the panel to the main panel
        JPanel base4 = new JPanel();
        base4.setLayout(new FlowLayout());
        base4.add(clear);
        base4.add(calculate);
        //calculate.addActionListener(this);
        base.add(base4);
        
        //Creates the calculations teller
        bmi = new JLabel("Body Mass Index: " );
        whRatio = new JLabel("Waist-to-Height Ratio: ");
        bpf = new JLabel("Percent Body Fat: ");
        lbm = new JLabel("Lean Body Mass: ");
        
        //Adds these labels to the main panel
        base.add(bmi);
        base.add(whRatio);
        base.add(bpf);
        base.add(lbm);
        
        //creates label for the last few lines and adds it to a panel and adds it to the main panel
        first = new JLabel("");
        second = new JLabel("");
        JLabel lastLine = new JLabel("Your diet should contain at least 49 grams of protein per day");
        JPanel base5 = new JPanel();
        base5.setLayout(new FlowLayout());
        base5.add(first);
        base5.add(second);
        base5.add(lastLine); 
        base.add(base5);
        
      frame.setSize(550,800);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       

  }
  public static void main(String[] args){
      BMICalc click = new BMICalc();
  }
}