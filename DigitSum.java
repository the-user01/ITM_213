
package practice_demo;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a digit: ");
        int digit = input.nextInt();
        
        int sum = 0;
        
        int temp = digit;
        
        while(temp != 0){
            int r = temp%10;
            sum += r;
            temp = temp/10;
        }
        System.out.println("Summation of the digit: "+sum);
        
          
    }

}
