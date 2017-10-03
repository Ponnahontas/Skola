package Kap1;

import javax.swing.*;//javax består av olika objektbibliotek som vi anropar/hämtar
//X är en förkortning inom Linux. x-fönster objekt
//swing är ett bibliotek som hanterar fönster popu objekter
import java.util.*;  //hämta system och tid/datum inställningar

class Grundmall2 {
    public static void main (String [] args){
        
        JOptionPane.showMessageDialog(null,"hej"+System.getProperty("user.name")+"!");
    }
}