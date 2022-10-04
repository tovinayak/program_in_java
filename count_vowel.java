//sumit-awasthi->https://github.com/sumit-awasthi
//Program for counting vowels from the string

import java.util.Scanner;
public class CountingVowels {
   public static void main(String args[]){
      int count = 0;
      System.out.println("Enter a sentence :");
      Scanner sc = new Scanner(System.in);
      String sentence = sc.nextLine();

      for (int i=0 ; i<sentence.length(); i++){
         char ch = sentence.charAt(i);
         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'|| ch == 'A'|| ch == 'E'|| ch == 'I' ||ch == 'O' ||ch == 'U'){
            count ++;
         }
      }
      System.out.println("Number of vowels in the given sentence is "+count);
   }
}
