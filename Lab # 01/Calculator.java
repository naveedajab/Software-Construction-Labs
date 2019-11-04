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

public class Calculator {
   Scanner n=new Scanner(System.in);
    int a=0;
    int b=0;
    public void UserInput(){
      System.out.println("Enter the value of a");
      a=n.nextInt();
      System.out.println("Enter the value of b");
      b=n.nextInt();
    }
    public void display(int result){
        System.out.println("Answer is "+ result);
    }
    public static void main(String args[]){
    Calculator c=new Calculator();
    int choice=0;
    int r=0;
    while(choice<6){
    System.out.println("////////////MENU////////////");
    System.out.println("Enter 1 for Addition");
    System.out.println("Enter 2 for Subtraction");
    System.out.println("Enter 3 for Multiplication");
    System.out.println("Enter 4 for Division");
    System.out.println("Enter 5 for Modulous");
    System.out.println("Enter 6 to Exit");
    System.out.println("Enter your choice...");
    choice=c.n.nextInt();
    switch(choice){
        case 1:
            c.UserInput();
            r=c.a+c.b;
            c.display(r);
            break;
        case 2:
            c.UserInput();
            r=c.a-c.b;
            c.display(r);
            break;     
         case 3:
            c.UserInput();
            r=c.a*c.b;
            c.display(r);
            break;
         case 4:
            c.UserInput();
            r=c.a/c.b;
            c.display(r);
            break;
          case 5:
            c.UserInput();
            r=c.a%c.b;
            c.display(r);
            break;
           case 6:
            System.err.println("Exiting....");
            break;
           default:
            System.err.println("Invalid Input!!!Try Again");
    }
    }
}
}