package Kul;

import javax.swing.*;

class kul1{
    public static void main (String[]args){
        String p1, p2, d1, d2;
        int i1, i2;
        
        p1=JOptionPane.showInputDialog("Mata in första personnummret!");
        d1=p1.substring(2,6);
        i1=Integer.parseInt(d1);
        
        p2=JOptionPane.showInputDialog("Mata in andra personnummret!");
        d2=p2.substring(2,6);
        i2=Integer.parseInt(d2);
        
        if(i1==i2){
            JOptionPane.showMessageDialog(null, "De fyller år samma dag!");
        }else{
            JOptionPane.showMessageDialog(null, "De fyller ej år samma dag!");
        }
        
    }
}