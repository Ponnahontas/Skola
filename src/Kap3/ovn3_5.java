package Kap3;
import javax.swing.*;
class ovn3_5{
    public static void main(String[]args){
        String s1;
        Double d1, d2,d3;
        s1=JOptionPane.showInputDialog("Ange antal år!");
        d1=Double.parseDouble(s1);
        d2=Math.log(2)/5730;
        d3=Math.pow(Math.E, (-d2)*d1);
        JOptionPane.showMessageDialog(null,"Då återstår "+(100*d3)+"% av ämnet!");
    }
}