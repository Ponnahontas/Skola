//vi ska skapa ett program som består av 4 String variabler och med
//3 olika tilldelningar. Den 4:e ska innehålla all text som vi hämta
//från tilldelningar. Använd av String funktion \n betyder radmatning

package Kap2;
import javax.swing.*;
class Övn_1 {
    public static void main (String [] args){
        String namn="Pontus", adress="Krunegårdsvägen", telenr="0709920940", 
                allt = namn + "\n" +adress +"\n" +telenr;
        //namn
        System.out.println(namn);
        System.out.println(adress);
        System.out.println(telenr);
        JOptionPane.showMessageDialog(null,namn + adress + telenr);
        JOptionPane.showMessageDialog(null, allt);
        //visa mig allt ska visas
        //Pontus
        //Krunegårdsvägen 
        //0709920940
        
    }
            
}