
package basicTutorial;

import java.util.Scanner;

public class While_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
       int digit, sum=0;
       
        System.out.print("Enter a digit: ");
        digit = input.nextInt();  
       
        while(digit != 0){ 
           
           int r = digit % 10;
           
            System.out.print(r+" ");
            
            sum += r;
            
            digit = digit / 10; 
            
        } // Loop ends
        
        System.out.println("\nThe sum is: "+sum);
       
    }
}
