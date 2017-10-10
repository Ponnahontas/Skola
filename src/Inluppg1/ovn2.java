package Inluppg1;

import javax.swing.*;

class ovn2{
    public static void main (String [] args){
        System.out.println(6+6);//Ger 12 då den hanterar siffrorna med vanlig addition i int
        
        System.out.println('6'+'6');/*Ger 108 eftersom den använder char när du skriver ''.
        I char hanteras siffrrorna som representanter för 54, som skrivs "6" i Ascii kod.
        */
        System.out.println("6.6"+"6.6");/*Blir 6.66.6 då den hanteras som String när du skriver med "".
        I String så skrivs allt in precis som du skrev det. Inga uträkningar äger rum, 
        utan istället adederas bara den nya "texten" efter den förra när + används.
        */
        System.out.println(6.6+6.6);/*Blir 13,2 då det hanteras med double. Datatypen double 
        kan hantera decimaltal. Siffrorna ses faktiskt som tal och uträkningar behandlas därefter.
       */
        //System.out.println('6.6'+"6.6");//Ger kompileringsfel, då char inte kan hantera decimaltal
    }
}