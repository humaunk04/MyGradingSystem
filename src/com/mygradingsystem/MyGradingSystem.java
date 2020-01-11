//Import is mean souce of java code which use to input//
//java.util is a package, while Scanner is a class of the java.u//

import java.util.Scanner;

public class MyGradingSystem {
    public static void main( String [] args){
        // Scanner class, which is used to get user input
        /* Now when you call Scanner input = new Scanner(System.in);
         you make a new object of the Scanner class (so you make a new "Scanner")
         and you store it in the variable input .*/
        Scanner input = new Scanner(System.in);
        int Score;
        String Name;
        // for is call loop which is like formula also code block to be executed//
        for (int a=1; a <= 100; a++){
            System.out.println("Put Student Name:");
            Name = input.next();

            System.out.println("Enter Student Score:");
            Score = input.nextInt();

            if (Score >= 90 && Score <= 100){
                System.out.println(" Student Name " +   Name   + " And Your Grade is: A ");
            }
            else if (Score >=70 && Score <= 89){
                System.out.println(" Student Name " +   Name   + " And Your Grade is: B ");
            }
            else if (Score >= 60 && Score <=69){
                System.out.println(" Student Name " +   Name   + " And Your Grade is: C ");
            }
            else if (Score >= 50 && Score <=59) {
                System.out.println(" Student Name " +   Name   + " And Your Grade is: D ");
            }
            else if (Score >= 40 && Score <=49){
                System.out.println(" Student Name " +   Name   + " And Your Grade is: E ");
            }
            else{
                System.out.println(" Student Name " +   Name   + " And Your Grade is: F ");
            }


        }

    }

}
