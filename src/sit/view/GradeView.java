package sit.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import sit.controller.Controller;


public class GradeView {
    
    private JFrame gradeFrame;
    private JLabel courseLabel = new JLabel("Course");
    private JLabel gradeLabel = new JLabel("Grade");
    private JLabel creditLabel = new JLabel("credit");
    private JLabel c1 = new JLabel("INT105");
    private JLabel c2 = new JLabel("INT106");
    private JLabel c3 = new JLabel("INT107");
    private JLabel c4 = new JLabel("GEN111");
    private JLabel c5 = new JLabel("MTH111");
    private JLabel c6 = new JLabel("LNG103");
    private JTextField g1 = new JTextField("F/A");
    private JTextField g2 = new JTextField("F/A");
    private JTextField g3 = new JTextField("F/A");
    private JTextField g4 = new JTextField("F/A");
    private JTextField g5 = new JTextField("F/A");
    private JTextField g6 = new JTextField("F/A");
    private JLabel cr1 = new JLabel("3");
    private JLabel cr2 = new JLabel("3");
    private JLabel cr3 = new JLabel("3");
    private JLabel cr4 = new JLabel("3");
    private JLabel cr5 = new JLabel("3");
    private JLabel cr6 = new JLabel("3");
    private JLabel gpa = new JLabel("GPA");
    private JTextField calgpa = new JTextField("x.xx");
    private JButton calculate = new JButton("Calculate");
    
    public GradeView(){
        gradeFrame = new JFrame("GPA calculator");
    }
    
    public void loadCurrencyForm(){
        JPanel currencyPanel = new JPanel();
        
        GridLayout grid = new GridLayout(8,3); // row col
        currencyPanel.setLayout(grid);
        //add component to Panel
        currencyPanel.add(courseLabel);
        currencyPanel.add(gradeLabel);
        currencyPanel.add(creditLabel);

        currencyPanel.add(c1);
        currencyPanel.add(g1);
        currencyPanel.add(cr1);
        
        currencyPanel.add(c2);
        currencyPanel.add(g2);
        currencyPanel.add(cr2);
        
        currencyPanel.add(c3);
        currencyPanel.add(g3);
        currencyPanel.add(cr3);
        
        currencyPanel.add(c4);
        currencyPanel.add(g4);
        currencyPanel.add(cr4);
        
        currencyPanel.add(c5);
        currencyPanel.add(g5);
        currencyPanel.add(cr5);
        
        currencyPanel.add(c6);
        currencyPanel.add(g6);
        currencyPanel.add(cr6);
        
        currencyPanel.add(gpa);
        currencyPanel.add(calgpa);
        
        JPanel gpaPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        gpaPanel.add(calculate);

        Controller gpaListener = new Controller(g1,g2,g3,g4,g5,g6,calgpa);
        calculate.addActionListener(gpaListener);
        gpaPanel.add(calculate);
//        
        gradeFrame.add(currencyPanel, BorderLayout.NORTH);
        gradeFrame.add(gpaPanel, BorderLayout.CENTER);
        
//        //set frame properties (default size is (0,0) visible is false)
        gradeFrame.setSize(500,300); //width,height
        gradeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        gradeFrame.pack();//ทำให้ขนาดโปรแกรมเล็กที่สุดเท่าที่จะเล็กได้
        gradeFrame.setVisible(true);
    }
    
}
