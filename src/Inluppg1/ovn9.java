package Inluppg1;

import javax.swing.*;

class ovn9{
    public static void main(String [] args){
        String Gemen, Versal;
        
        Gemen=JOptionPane.showInputDialog("Mata in en gemen!");
        Gemen=Gemen.toUpperCase();
        JOptionPane.showMessageDialog(null,"Som versal är det: "+Gemen+"!");
        
        Versal=JOptionPane.showInputDialog("Mata in en Versal!");
        Versal=Versal.toLowerCase();
        JOptionPane.showMessageDialog(null,"Som gemen är det: "+Versal+"!");
        
    }
}