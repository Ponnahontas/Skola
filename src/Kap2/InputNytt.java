package Kap2;

import javax.swing.*;

class InputNytt{
    public static void main (String [] args){
        String namn, kurs; //variabel deklaration steg 1 och 2
        
        namn=JOptionPane.showInputDialog("Vad heter du?");
        //nytt här ShowInputDialog där användare har möjlighet att skriva in
        //något
        System.out.println(namn); //terminalprogrammering, se svaret
        //längs ned
        JOptionPane.showMessageDialog(null, namn,"Välkomsthälsning",1);
        
        //namn är en variabeldeklaration som man både tilldelar och anropar
        namn=JOptionPane.showInputDialog(null,"What is your name?","Läsa in namnet",3);
        //siffror 0,1,2,3 är olika sätt att ange meddelande typ
    }
}