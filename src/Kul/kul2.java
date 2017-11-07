package Kul;

import javax.swing.*;

class kul2{
    public static void main (String[]args){
       String minuter;
       int i1;
       
       minuter=JOptionPane.showInputDialog("Mata in antal minuter du kommer ringa!");
       i1=Integer.parseInt(minuter);
       
       if(i1<=33){
           JOptionPane.showMessageDialog(null, "Kontant är bäst för dig");
       }else if(i1<=66){
           JOptionPane.showMessageDialog(null, "Normal är bäst för dig");
       }else{
           JOptionPane.showMessageDialog(null, "Plus är bäst för dig");
       }
           
       
        
    }
}    