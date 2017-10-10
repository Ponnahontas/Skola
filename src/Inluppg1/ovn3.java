package Inluppg1;

import javax.swing.*;

class ovn3{
    public static void main (String [] args){
        String s1,s2;
        int i1,i2;
       
        s1=JOptionPane.showInputDialog("Mata in tal 1!");
        i1=Integer.parseInt(s1);
       
        s2=JOptionPane.showInputDialog("Mata in tal 2!");
        i2=Integer.parseInt(s2);
        
        JOptionPane.showMessageDialog(null,s1+" gånger "+s2+" är "+(i1*i2)+".");
        
    }
}