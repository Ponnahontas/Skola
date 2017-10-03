package Kap3;
import javax.swing.*;
class IntVar{
    public static void main (String[]args){
        //smart tänkt , mindre skrivande
        String s;
        int t1, t2;
        double d1, d2;
        
        s=JOptionPane.showInputDialog("Ange tal 1");
        t1 =Integer.parseInt(s);
        s=JOptionPane.showInputDialog("Ange tal 2");
        t2 =Integer.parseInt(s);
         s=JOptionPane.showInputDialog("Ange dectal 1");
        d1 =Double.parseDouble(s);
         s=JOptionPane.showInputDialog("Ange dectal 2");
        d2 =Double.parseDouble(s);
        
        JOptionPane.showMessageDialog(null, "Resultatet blir: "+s+ (t1+d2));
    }
}        