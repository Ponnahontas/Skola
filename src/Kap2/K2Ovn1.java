package Kap2;
import javax.swing.*;
class K2Ovn1 {
    public static void main (String [] args) {
        //Genomgång, vad är en variabel? Kap2, se boken
        String s1, s2;
        s1="Hej";
        s2="på dig";
        
        //en variabel eller flertals variabler kan jämföras som ATT
        //placera olika saker i en byrå, kan vara ett värde av typ bokstäver
        //siffror och tecken.
        //Dock måste varje variabel kopplas till en datatyp i detta fall
        //string och ett namn s1 eller s2
        //= tecken betyder inom programmering tilldelas
        //så s1 tilldelas ett värde med textinnehål "Hej"
        //ooch s2 tilldelas ett värde med textinnehåll "på dig"
        s2=s1; //betyder att s2 får innehållet av s1
        System.out.println(s2);
        System.out.println(s1);
        
        s1=s2+" hem"+" Tony";
        System.out.println(s1);   
               //kort sammanfattning, Vad är en variabel deklaration?
        //1. Måste man välja datatyp ex String
        //2. Varje datatyp/datatyper måste ha ett namn /flertal namn, s1, s2
        //3. Varje datatyp måste tilldelas ett värde eller en funktion
        s2=s2 + " " +System.getProperty("user.name");
        System.out.println(s2);
    }
}

