package Inluppg1;

import javax.swing.*;

class ovn10{
    public static void main(String [] args){
        String s1, s2, s3;
        int stegint, i1, i2,i3, i4;
        char c1;
        s3="";
        
        s1=JOptionPane.showInputDialog("Mata in ett tecken som ska förskjutas(ej å,ä eller ö)!");
        stegint=1;
        
     
        for(i3=0; i3<s1.length();i3++){
          
            i4=(int)(s1.charAt(i3));
            c1=(char)(int)(s1.charAt(i3));  
          
          if(i4>90){
                
              if((int)(s1.charAt(i3) + stegint)>122){
                    stegint=stegint-26;
                } 
            }
                else{
                  
                    if((int)(s1.charAt(i3) + stegint)>90){
                    stegint=stegint-26;
                    }
                }   
        s3 = s3 + Character.toString((char)(int)(s1.charAt(i3) + stegint));
        
        }
        
        JOptionPane.showMessageDialog(null,s1+" förskjutet ett steg blir "+s3);
    }
}