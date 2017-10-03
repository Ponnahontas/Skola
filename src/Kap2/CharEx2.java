package Kap2;
import javax.swing.*;
class CharEx2{
    public static void main (String [] args){
        char tecken='a'; //hantera tecken max 1 åt gången
        String s=" " + tecken +tecken;//hantera siffor, bokstäver, tecken
        int t =2;//hanera heltal
        double dec=5.1;//hanera decimaler
        //kolla svaret
        //JOptionPane.showMessageDialog(null, tecken + s);//a aa
        //JOptionPane.showMessageDialog(null, s + tecken);//aaa
        JOptionPane.showMessageDialog(null, tecken +t);//99
        JOptionPane.showMessageDialog(null, t+ tecken);//99
        JOptionPane.showMessageDialog(null, s + t +tecken);//aa2a
        JOptionPane.showMessageDialog(null, t +s+tecken);//2 aaa
        JOptionPane.showMessageDialog(null, dec +t +s+tecken);//7.1 aaa
        JOptionPane.showMessageDialog(null, tecken+dec+s+t);//102.1 aa2
    }
}


