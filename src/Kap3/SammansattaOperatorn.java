/* Operaterd betyder de 4 räknesätt, + - * / %

*/

package Kap3;

import javax.swing.*;

class SammansattaOperatorn{
    public static void main (String[]args){
        
        int a=8, sum=10, diff=20, prod=30, div=40;
        
        sum +=a;   //sum = sum+a (10+8=18,    18=10+8)
        System.out.println(sum);
        
        diff -=a;    //diff = diff -a
        //12=20-8
        System.out.println(diff);
        
        prod  *=diff;
        //360=30*12
        System.out.println(prod);
        
        div /=sum+a;
        //1= 40/(18+8)
        System.out.println(div);
        
        String s="";
        s +=sum +diff + prod +div;
        System.out.println(s);
        
    }
}