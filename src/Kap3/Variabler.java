//Nytt i kap3, genomgång 2 sista variabler, int och double
//samt omvandling från String till int eller double


package Kap3;
import javax.swing.*;
class Variabler{
    public static void main (String[]args){
    //Variabeldeklaration
        //steg 1 val av datatyper, ex String, int, double, char
        //steg 2 ange ett unikt namn, ex s1, t1, dec1, tecken
        //steg 3 tilldela ett värde eller en funktion för 
        //respektive datatyper
       /* String s1 =JOptionPane.showInputDialog("Ange ett tal 1");
        System.out.println(s1);
        
        String s2 = JOptionPane.showInputDialog("Ange ett tal 2");
        JOptionPane.showMessageDialog(null,s1 +s2);*/
        
        int t1, t2;     //hantera heltal
        double d1, d2;  //hantera decimaler
        
      /*  String s3 =JOptionPane.showInputDialog("Ange ett tal 3");
        t1 =Integer.parseInt(s3);       //omvandla s3 till int
        String s4 =JOptionPane.showInputDialog("Ange ett tal 3");
        t2 =Integer.parseInt(s4); 
        JOptionPane.showMessageDialog(null, t1-t2);*/
        
        String s5 = JOptionPane.showInputDialog("Ange ett dectal 1");
        d1 = Double.parseDouble(s5);
        
        String s6 = JOptionPane.showInputDialog("Ange ett dectal 2");
        d2 = Double.parseDouble(s6);
        
        JOptionPane.showMessageDialog(null, d1+d2);
        
        
    }
}
        