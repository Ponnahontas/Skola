package inluppg1;

import javax.swing.*;

class ovn7{
    public static void main(String [] args){
    String start;
    int i, tio,tiomod, fem, femmod, en,enmod, femtio;
    
    start=JOptionPane.showInputDialog(null,"Mata in antal ören!");
    i=Integer.parseInt(start);
    
    tio= i/1000;
    
    tiomod= i%1000;
    
    fem= tiomod/500;
    
    femmod=tiomod%500;
    
    en=femmod/100;
    
    enmod=femmod%100;
    
    femtio=enmod/50;
    
    JOptionPane.showMessageDialog(null,"Tiokronor:"+tio+"\nFemkronor:"+fem+
            "\nEnkronor:"+en+"\nFemtioöringar:"+femtio);
    }
}

    
