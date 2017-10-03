/*skapa en miniräknare som ta emot valfritt 2 heltal samt
 * utför de 4 räknesätten dvs +-*/
package Kap3;
import javax.swing.*;
class miniraknare{
    public static void main(String[]args){
        String s1,s2;
        s2=JOptionPane.showInputDialog("Välj räknesätt");
        int i1,i2, i3;
        s1=JOptionPane.showInputDialog("Ange tal 1");
        i1= Integer.parseInt(s1);
        s1=JOptionPane.showInputDialog("Ange tal 2");
        i2= Integer.parseInt(s1);
        i3= i1+Integer.parseInt(s2)+i2;
        
        JOptionPane.showMessageDialog(null, i3);
    }
}