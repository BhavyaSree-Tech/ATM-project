package javaprograms;
import java.util.Scanner;
class ATM{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        float balance=8000;
        int password=5586;
        boolean logged_in=false;
        for(int i=1;i<=3;i++){
            System.out.print("Enter password:");
            int current_password=s.nextInt();
            if(current_password==password){
                   logged_in=true;
                   break;
             }
            else{
                    if(i!=3){
                        System.out.println("You had been entered wrong password "+i+ " of 3");
                    }
                    else{
                        System.out.println("Too many failed attempts! You can try after 24 hours");
                    }
                }
         }
         if(logged_in){
             System.out.println("-------WELCOME TO SBI ATM-----");
             while(true){
                System.out.println("Choose options:");
                System.out.println(" 1.Check Balance\n 2.Withdrawal\n 3.Deposit\n 4.Exit");
                System.out.print("Enter option:");
                int option=s.nextInt();
                switch(option){
                    case 1:
                        System.out.println("Balance is :"+balance);
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw:");
                        float wd_amount=s.nextFloat();
                        if(balance>=wd_amount){
                            balance-=wd_amount;
                            System.out.println("Amount successfully withdrawn. ");
                            System.out.println("Available balance :"+balance);
                        }
                        else{
                            System.out.println("Insufficient Balance.");
                        }
                        break;
                    case 3:
                        System.out.print("Enter amount to deposit:");
                        float dep_amount=s.nextFloat();
                        balance+=dep_amount;
                        System.out.println("Amount successfully deposited.");
                        System.out.println("Available balance:"+balance);
                        break;
                    case 4:
                        System.out.println("Thank you!");
                        return;
                    default:
                         System.out.println("Invalid choice.Please try again!!");
                }
            }
          }    
       }       
}
