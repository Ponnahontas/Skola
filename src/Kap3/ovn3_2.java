package Kap3;
import javax.swing.*;
class ovn3_2{
    public static void main(String[]args){
        String s1;
        double d1;
        s1=JOptionPane.showInputDialog("Skriv in temperaturen i fahrenheit!");
        d1=Double.parseDouble(s1);
        JOptionPane.showMessageDialog(null,"I celsius är det "+((d1-32)*5/9)+" grader!");
    }
}