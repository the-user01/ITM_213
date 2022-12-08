
package practice_demo;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a digit: ");
        int digit = input.nextInt();
        
        int temp,r, store=0;
        
        temp = digit;
        
        while(temp!=0){
            r = temp%10;
            store = store*10 + r;
            temp = temp/10;
        }
        System.out.println("Reverse digit: "+store);
        
        if(store == digit){
            System.out.println("The number is palindrome");
        }
        else{
            System.out.println("The number is not palindrome");
        }
        
    }
    
}
