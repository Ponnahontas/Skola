package Kap2;
import javax.swing.*;
class ovn6{
    public static void main(String[]args){
        String s1,s2,s3;
        int i1,i2,i3;
                s1=JOptionPane.showInputDialog("Ange antalet timmar");
                s2=JOptionPane.showInputDialog("Ange antalet minuter");
                s3=JOptionPane.showInputDialog("Ange angtalet sekunder");
                i1=Integer.parseInt(s1);
                i2=Integer.parseInt(s2);
                i3=Integer.parseInt(s3);
                JOptionPane.showMessageDialog(null,"Det är "+((i1*3600)+(i2*60)+i3)+ " sekunder!");
    }
}