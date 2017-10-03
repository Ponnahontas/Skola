package Kap2;
import javax.swing.*;
//datatyp char är syskon till datatyp String men kan bara hantera max ett tecken
//åt gången.
//Varför behöver man använda char?
//för att hantera lösenord i säkert system, samt vid spelprogrammering.
class DatatypChar {
    public static void main (String [] args){
        char tecken ='a';//OBS se skillnad mellan " " String och ' ' char
        JOptionPane.showMessageDialog(null, tecken);
        
        char tecken2='b';
        JOptionPane.showMessageDialog(null, tecken +tecken2);
        //ab
        //ascii tabell
        char c = '\u2663';
        JOptionPane.showMessageDialog(null, c);
       //unicode
        
    }
}