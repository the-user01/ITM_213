
package practice_demo;
import java.util.Scanner;

public class FactorialDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num,i;
        long fact=1;
        
        System.out.print("Enter a digit: ");
        num = input.nextInt();
        
        for (i = num; i >= 1; i--) {
            System.out.print(i+" ");
            fact*=i;
        }
        
        System.out.println("\nFactorial: "+fact);
    }
    
}
