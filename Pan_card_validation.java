// Username - Saurabh-2809
// Github Id - https://github.com/Saurabh-2809

// Progrma to check whether PAN CARD number is valid or not

import java.util.regex.*; 
import java.util.Scanner;

public class ValidPancard{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your PAN number");
        String pan = s.nextLine();
         if(Pattern.matches("[A-Z]{5}[0-9]{4}[A-Z]",pan))
         {
             System.out.println("Valid PAN number");
         }
         else{
             System.out.println("Invalid PAN number");
         }
    }
}

