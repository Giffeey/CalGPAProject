package sit.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

public class Controller implements ActionListener {
    
    private JTextField g1;
    private JTextField g2;
    private JTextField g3;
    private JTextField g4;
    private JTextField g5;
    private JTextField g6;
    private JTextField calgpa;

    public Controller(JTextField g1, JTextField g2, JTextField g3, JTextField g4, JTextField g5, JTextField g6, JTextField calgpa) {
        
        this.g1 = g1;
        this.g2 = g2;
        this.g3 = g3;
        this.g4 = g4;
        this.g5 = g5;
        this.g6 = g6;
        this.calgpa = calgpa;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String arrayg[] = {g1.getText().toLowerCase(),g2.getText().toLowerCase(),g3.getText().toLowerCase()
                ,g4.getText().toLowerCase(),g5.getText().toLowerCase(),g6.getText().toLowerCase()};
        double arrayi[] = new double[6];
        for (int i = 0 ; i<arrayg.length ; i++){
            switch(arrayg[i]){
                case "a" : arrayi[i] = 4;break;
                case "b+" : arrayi[i] = 3.5;break;
                case "b" : arrayi[i] = 3;break;
                case "c+" : arrayi[i] = 2.5;break;
                case "c" : arrayi[i] = 2;break;
                case "d+" : arrayi[i] = 1.5;break;
                case "d" : arrayi[i] = 1;break;
                case "f" : arrayi[i] = 0;break;
            }
        } 
        double sum = arrayi[0]+arrayi[1]+arrayi[2]+arrayi[3]+arrayi[4]+arrayi[5];
        sum = sum*3/18d;
        
        calgpa.setText(sum+"");
    }
    
    
}
