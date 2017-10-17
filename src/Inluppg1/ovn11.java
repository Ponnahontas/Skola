package Inluppg1;

import javax.swing.*;

class ovn11{
    public static void main(String [] args){
        String steg, s1, s2, s3;
        char c1, c2;
        int stegint, i1, i2,i3, i4;
        
        s2="";
        s1=JOptionPane.showInputDialog("Mata in ett tecken som ska förskjutas(ej å,ä eller ö)!");
        steg=JOptionPane.showInputDialog("Hur många steg vill du förskjuta(max 26)?");
        i4=s1.length();
        stegint=Integer.parseInt(steg);
        if (stegint>26){
            JOptionPane.showMessageDialog(null,"Max 26!!!","Fel",JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }
        for(i3=0; i3<s1.length();i3++){
            c1=s1.charAt(i3);
            i1=(int)c1;
            if(i1<=90){
                i2=i1+stegint;
                if(i2>90){
                    i2=i2-26;
                }
            } else {
                i2=i1+stegint;
                if(i2>122){
                    i2=i2-26;
                }
            }
            c2=(char)i2;

            s2=String.valueOf(c2);
        }
        
        JOptionPane.showMessageDialog(null,s1+" förskjutet "+steg+" steg blir "+s2+"!");
        
    }
        
}
