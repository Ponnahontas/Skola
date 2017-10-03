package Kap2;
import javax.swing.*;
class ovn3{
    public static void main(String[]args){
        double d1,d2,d3;
        String s1, s2, s3;
        s1=JOptionPane.showInputDialog("Mata in ett decimaltal!");
        d1= Double.parseDouble(s1);
        s2=JOptionPane.showInputDialog("Mata in ännu ett decimaltal!");
        d2= Double.parseDouble(s2);
        s3=JOptionPane.showInputDialog("Mata in ett sista decimaltal!");
         d3= Double.parseDouble(s3);
        
       
        JOptionPane.showMessageDialog(null,"Svaret är "+(d1+d2+d3)+"!");
    }
}