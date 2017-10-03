/*datatyp String är vår första datatyp vi kommer att jobba med inom programmering
 *Den kan hanera alla bokstäver, siffror och tecken, inklusive svenska åäö
 * Kallas även standard datatyp
 */

package Kap1;
import javax.swing.*;
        
class Stringdatatyp{
    public static void main (String [] args){
        //kan ni se skillnader mellan en string och en annan string
        
        String s1, s2;
        s1="Hej";
        s2=s1; //får s2 samma värde som s1?
                
        
        JOptionPane.showMessageDialog(null, s1);
        JOptionPane.showMessageDialog(null,"Innehållet i s2" + s2);
  
        s2=s2 + " på dig!";
        JOptionPane.showMessageDialog(null, s2);
        String s3, s4;
        s3="5";
        s4="6";
                JOptionPane.showMessageDialog(null,"s3 och s4 får värdet " +s3+s4);
                
                String s5;
                s5=s2 +s3+s4; //värdet Hej på dig 56
                JOptionPane.showMessageDialog(null, s5);
    }
}
