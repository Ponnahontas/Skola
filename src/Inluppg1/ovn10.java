package Inluppg1;

import javax.swing.*;

class ovn10{
    public static void main(String [] args){
        String s1, s2;
        char c1, c2;
        int i1, i2;
        
        s1=JOptionPane.showInputDialog("Mata in ett tecken som ska förskjutas(ej å,ä eller ö)!");
      if (s1.equals("Z")){
          s2="A";
      }else if(s1.equals("z")){
          s2="a";
      }else{
        c1=s1.charAt(0);
        i1=(int)c1;
        i2=i1+1;
        c2=(char)i2;
        s2=String.valueOf(c2);
      }
      
        
                JOptionPane.showMessageDialog(null,s1+" förskjutet ett steg blir "+s2+"!");
    }
}