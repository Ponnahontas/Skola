/*Mer om standardklassen String
Stringklass är en extra funktion till datatypen String
* och med hjälp av dessa kombinatoner med if-sats /forsats
* kan man ge programmet en helt annat utseende
* Gula rutan i boken är mycket viktig att förstå
*/
package Kap2;

import javax.swing.*;

class StringKlass{
    public static void main(String[]args){
        
        String a, b;  //variabeldeklaration steg 1 och 2
        int i;
        //variabeldeklaration
        //steg 1, val av datatyper
        //steg 2, ange unik namn ex tal
        //steg 3,tilldela ett värde eller funktion
        a="programspråk";//steg 3
        System.out.println(a);
        i=a.length();//en räknare
        System.out.println(i);//kombination av int och String
        //räkna med antalet tecken på ordet programspråk
        
        b="var"+ a.charAt(3);
        System.out.println(b);//charAt hämtar positioner fårn texten
        //programspråk och positionerna börjar alltid med 0
        b=a.substring(7);       //substring, klippa av ordet fårn position 7
        System.out.println(b);
        b=a.substring(3,7);     //substring, klippa av ordet från 3 till 7
        System.out.println(b);
        i=a.indexOf("ram");
        System.out.println(i);
        //-1 betyder att värde saknas
        a="Erik Andersson 860312-2714";
        a=a.trim();     //man gör en exakt kopia av a men tar även bort
        //onödiga mellanslag i början och i slutet av texten
        System.out.println(a);
        int j=a.lastIndexOf(' ')+1; //
        System.out.println(j);
        
    }
}

