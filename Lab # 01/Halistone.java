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
public class Halistone {
    public static void main(String args[]){
        int n=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an integer");
        n=input.nextInt();
        while(n>1){
            if(n%2==0){
                n=n/2;
                System.out.print(n+",");
        }
            else{
                n=(3*n)+1;
                System.out.print(n+",");
            }
    }
}
}
