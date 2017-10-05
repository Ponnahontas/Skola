package Kap3;
import javax.swing.*;
class ovn3_4{
    public static void main(String[]args){
        String s1, s2, s3, s4;
        Double x1, x2, y1, y2, d5, d6, d7;
        s1=JOptionPane.showInputDialog("Mata in kordinaterna för x1!");
        x1=Double.parseDouble(s1);
        s2=JOptionPane.showInputDialog("Mata in kordinaterna för x2!");
        x2=Double.parseDouble(s2);
        s3=JOptionPane.showInputDialog("Mata in kordinaterna för y1!");
        y1=Double.parseDouble(s3);
        s4=JOptionPane.showInputDialog("Mata in kordinaterna för y2!");
        y2=Double.parseDouble(s4);
        d5=Math.pow(x1-x2, 2);
        d6=Math.pow(y1-y2, 2);
      
        d7=Math.pow(d5+d6, 0.5);
        JOptionPane.showMessageDialog(null,"Då är sträckan mellan punkterna "+d7+" längdenheter!");
    }
}