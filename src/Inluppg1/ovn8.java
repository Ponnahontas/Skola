package inluppg1;

import javax.swing.*;

class ovn8{
    public static void main(String [] args){
        String s;
        char a,b,c;
        
        s=JOptionPane.showInputDialog("Mata in 3 tecken!");
        
        a=s.charAt(2);
        b=s.charAt(1);
        c=s.charAt(0);
        
        JOptionPane.showMessageDialog(null,"Omvänt är det: "+a+b+c);
    }
}