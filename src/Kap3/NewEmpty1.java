package Kap3;
import javax.swing.*;
class NewEmpty1{
    public static void main(String[]args){
    String s1;
    double d1, d2, d3, d4, d5, d6, d7, d8;
    d2=3.14159265359;
    s1=JOptionPane.showInputDialog("Mata in radien i cm!");
    d1=Float.parseFloat(s1);
    d3=Math.pow(d1, 3);
    d4=Math.pow(d1, 2);
    d5=(4*d2*d3)/3;
    d6=4*d2*d4;
    d7=Math.round(d5);
    d8=Math.round(d6);
    JOptionPane.showMessageDialog(null,"Volymen är då avrundat "+d7+
           " kubikcentimeter och radien är avrundat "+d8+" kvadratcentimeter!");
   
    }
}