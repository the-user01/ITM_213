
package practice_demo;
import java.util.Scanner;

public class LoopSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        int n, sum=0;
        
        System.out.print("Enter the last number: ");
        n = input.nextInt();
        
        for (int i = 1; i <= n; i++) {
                sum+= i*i;
                System.out.print(i+"X"+i+"+"+" ");

        }
        
        System.out.println("\nSum: "+sum);
        */
        
        /*
        double n, result=1, i;
        
        System.out.print("Enter the last number: ");
        n = input.nextDouble();
        
        for (i = 1.5; i <= n; i++) {
            result*=i;
            System.out.print(i+" ");
        }
        
        System.out.println("\nResult: "+Math.round(result));
        */
        
        int n, result=1, i;
        
        System.out.print("Enter last digit: ");
        n = input.nextInt();
        
        for (i= 1; i <= n; i++) {
            System.out.print(i+"x"+i+" ");
            result*=i*i;
        }
        
        System.out.println("\nResult: "+result);
       
    }
        
}
