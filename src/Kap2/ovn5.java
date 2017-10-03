package Kap2;
import javax.swing.*;
class ovn5{
    public static void main(String[]args){
        String s;
        double d;
        s=JOptionPane.showInputDialog("Skriv in antal miles");
        d=Double.parseDouble(s);
        JOptionPane.showMessageDialog(null,s+" antal miles är lika mycket som "+(d*1.60935)+" kilometer");
    }
}