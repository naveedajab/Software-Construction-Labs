
package lab2;
import java.util.*;
/**
 *
 * @author fa16-bse-081
 * create a bank account class each bank account object represents information about the user 
 * like name and balance each class has method to deposit and withdraw money balance should reflect 
 * these operations the method also make sure the balance is never zero also calculate the number of 
 * transaction carried out on the bank account.
 */
public class BankAccount{
   String  name;
   int balance;
   int numberOfTransaction;
   BankAccount(String n,int b){
       name=n;
       balance=b;
   }
   public void deposit(int money){
       if(money<500){
           System.out.println("Minimum deposit amount is Rs.500");
       }
       else{
       balance=balance+money;
       System.out.println("Successfully Desposited! Your new balance is "+balance);
       numberOfTransaction++;
   }
   }
   public void withDraw(int amount){
       if(amount<=0){
           System.out.println("You have Zero balance in your account");
       }
      if(amount<500){
          System.out.println("Minimum withdraw amount is Rs.500");
      }
      else{
       balance=balance-amount;
       System.out.println("Successfully withdrawed! Your new balance is "+balance);
       numberOfTransaction++;
   }
   }
   public void details(){
     System.out.println("Welcome!!!");
     System.out.println("Account Owner Name: "+ name);
     System.out.println("Account Baalnce: "+ balance);
     System.out.println("Total number of Transctions: "+numberOfTransaction );
   }
    public static void main(String args[]){
        int choice=0;
        int amount=0;
        BankAccount current=new BankAccount("Rizwan",100000);
        Scanner in=new Scanner(System.in);
        while(choice<4){
        System.out.println("//////////MENU/////////////");
        System.out.println("Press 1 if you want to check your details");
        System.out.println("Press 2 if you want to deposit amount");
        System.out.println("Press 3 if you want to withdraw amount");
        System.out.println("Press 4 if you want to exit");
        System.out.println("Enter your choice....");
        choice=in.nextInt();
        switch(choice){
            case 1:
                current.details();
                break;
            case 2:
                System.out.println("Enter the amount you want to deposit...");
                amount=in.nextInt();
                current.deposit(amount);
                break;
            case 3:
                System.out.println("Enter the amount you want to withDraw...");
                amount=in.nextInt();
                current.withDraw(amount);
                break;
            case 4:
                System.out.println("Thank You for Banking with Us....");
                break;
            default:
                System.err.println("Invalid Transaction.....Try Again");
        }
    }
    }
}