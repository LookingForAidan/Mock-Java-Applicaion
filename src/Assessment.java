/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author x12431938
 */
import java.awt.Color;
import javax.swing.*;
public class Assessment extends JFrame{
    private String name;
    private String type;
    private double weighting;
    
    public Assessment(){
        name = new String();
        type = new String();
        weighting = 0.0;
    }
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    
    public String getAType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeighting() {
        return weighting;
    }

    public void setWeighting(double weighting) {
        this.weighting = weighting;
    }
    
    //declare objects
    private JPanel p;
    private JLabel meetLbl;
    private JLabel needsLbl;
    private JLabel learnLbl;
    private JLabel actLbl;
    private JLabel assistLbl;
    private JLabel supportLbl;
    private JLabel examsLbl;
    private JButton addBtn1;
    private JButton addBtn2;
    private JButton addBtn3;
    private JButton addBtn4;
    private JButton addBtn5;
    private JButton addBtn6;
    private JButton addBtn7;  
}