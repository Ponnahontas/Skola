package Kap2;

import javax.swing.*;

class ovn2_3{
    public static void main (String [] args){
        String förnamn, efternamn, hälsning;//Jag deklarerar variablerna
        
        förnamn = JOptionPane.showInputDialog("Vad heter du i förnamn?");
        efternamn = JOptionPane.showInputDialog("Vad heter du i efternamn?");
        hälsning = "Välkommen "+förnamn+" "+efternamn;
        
        JOptionPane.showMessageDialog(null, hälsning);
    }
}