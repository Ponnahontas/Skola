package inluppg1;

import javax.swing.*;

class lel{
    public static void main(String[]args){
        String s1, s2, s3;
        int i1,i2;
        s3="";
        
        s1 = JOptionPane.showInputDialog("Skriv ett ord");
        
        s2 = JOptionPane.showInputDialog("Steg");
        i1 = Integer.parseInt(s2);
        
        for (int i=0; i<s1.length();i++){
            
            s3 = s3 + Character.toString((char)(int)(s1.charAt(i) + i1));
        }
        
        System.out.println(s3);
    }
}