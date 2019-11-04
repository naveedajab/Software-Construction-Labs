/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sclab1;
import java.util.Scanner;
/**
 *
 * @author fa16-bse-081
 */
public class Palindorme {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int n=0;
        int r=0;
        int sum=0;
        //String rev =" ";
        System.out.println("Enter a number...");
        n=input.nextInt();
        int o=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
           /* rev=Integer.toString(r);
            System.out.print(rev);
        }
        if(o==Integer.parseInt(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not Palindrome");
        }*/
        }
        if(sum==o){
            System.out.println("Palindrome"); 
        }
        else{
            System.out.println("not Palindrome");
        }
}
}
