package Kul;

import javax.swing.*;

class kul3{
    public static void main(String[]args){
        String r;
        double ir, omkrets, area;
        
        r=JOptionPane.showInputDialog("Mata in radien!");
        ir=Integer.parseInt(r);
        
        if(ir<=0){
            JOptionPane.showMessageDialog(null,"Radien måste vara större än 0!","Fel",JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }
        omkrets=2*ir*Math.PI;
        area=Math.PI*ir*ir;
        
        JOptionPane.showMessageDialog(null, "Arean är "+(int)area+" kvadratcentimeter och omkretsen är "+(int)omkrets+" centimeter!");
    }
}