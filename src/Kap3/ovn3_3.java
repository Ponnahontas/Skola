package Kap3;
import javax.swing.*;
class ovn3_3{
    public static void main(String[]args){
        String s1;
        Double d1, d2;
        s1=JOptionPane.showInputDialog("Ange antal miles du kan köra per gallon!");
        d1=Double.parseDouble(s1);
        d2=(d1*1.609/3.785);
        JOptionPane.showMessageDialog(null,"Det blir då "+d2+" liter/kilometer!");
        
        
    }
}