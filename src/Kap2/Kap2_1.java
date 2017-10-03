package Kap2;
import java.util.*;
import javax.swing.*;
class Kap2_1{
    public static void main(String[]args){
        String a, b;
        a=Calendar.getInstance().getTime().toString();
        System.out.println(a);
        b=a.substring(11,19);
        JOptionPane.showMessageDialog(null,"Klockan är: "+b);
                
    }
}
        