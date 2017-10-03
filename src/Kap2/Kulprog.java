package Kap2;

import javax.swing.*;
//omvlandla en bokstav till ascii kod tabell
class Kulprog {
    public static void main (String [] args){
        char tecken;
        String s;
        
        s=JOptionPane.showInputDialog("Mata in ett tecken");
        
        tecken=s.charAt(0); // ta ut 1:a tecknet ur String
        //och omvandla det till char tecken
        
        JOptionPane.showMessageDialog(null, "Det inmatade tecken är " +s +" \n efter omvandling till Ascii tabell"
                +" blir det "+(int)tecken );
        
    }
}
        