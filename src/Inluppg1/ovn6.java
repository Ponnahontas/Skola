package Inluppg1;
 
import javax.swing.*;

class ovn6{
    public static void main(String [] args){
        String timmar, minuter, sekunder;
        int i1,i2,i3;
        
        timmar=JOptionPane.showInputDialog("Mata in antal timmar!");
        i1=Integer.parseInt(timmar);
        
        minuter=JOptionPane.showInputDialog("Mata in antal minuter!");
        i2=Integer.parseInt(minuter);
        
        sekunder=JOptionPane.showInputDialog("Mata in antal sekunder!");
        i3=Integer.parseInt(sekunder);
        
        JOptionPane.showMessageDialog(null,timmar+"h "+minuter+"min "+sekunder+"sek. Det blir "+((i1*3600)+(i2*60)+i3)+" sekunder!");
        
    }
}