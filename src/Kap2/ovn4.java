package Kap2;
import javax.swing.*;
class ovn4{
    public static void main(String[]args){
        String s1,s2,s3;
        double d1, d2,d3;
        s1=JOptionPane.showInputDialog("Mata in ett tal!");
        d1=Double.parseDouble(s1);
        s2=JOptionPane.showInputDialog("Mata in ett tal!");
      d2=Double.parseDouble(s2);
        s3=JOptionPane.showInputDialog("Mata in ett tal!");
        d3=Double.parseDouble(s3);
        
        JOptionPane.showMessageDialog(null,"Genomsnittet är "+((d1+d2+d3)/3));
    }
}