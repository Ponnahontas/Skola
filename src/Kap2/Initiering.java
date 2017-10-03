//Initiering att man tilldelas variabler med ett värde
//Det är inte önskvärt att blanda ihop de olika varieblerna eller datatyper
//men ibland måste man göra det för att ge olika värdena en annan funktion
package Kap2;
import javax.swing.*;
class Initiering {
    public static void main (String [] args) {
        
        String s1="Välkommen" ;
        int i1=5, i2=4; //int betyder heltalshantering
        
        JOptionPane.showMessageDialog(null, s1 +i1+i2);
        JOptionPane.showMessageDialog(null, i1+i2);
        JOptionPane.showMessageDialog(null, i1+i2+s1);
        JOptionPane.showMessageDialog(null, " " +(i1+i2));
        JOptionPane.showMessageDialog(null," "+i1+i2);
    }
}
       