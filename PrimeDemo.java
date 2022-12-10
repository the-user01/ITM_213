
package practice_demo;

import java.util.Scanner;

public class PrimeDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        /*
         int num, i, count = 0;
        
        System.out.print("Enter any positive integer: ");
        num = input.nextInt();
        
        for (i = 2; i < num; i++) {
            if(num%i == 0){
                count++;
                break;
            }
        }
        if(count == 0){
            System.out.println("Prime number");
        }else{
            System.out.println("Not Prime");
        }
        */
        
        int m,n, count=0, totalPrime=0;
        
        System.out.print("Enter initial number: ");
        m = input.nextInt();
        
        System.out.print("Enter last number: ");
        n = input.nextInt();
        System.out.println();
        
        for (int i = m; i <= n; i++) {
            
            for (int j = 2; j < i; j++) {
                
                if(i%j==0){
                    count++;
                    break;
                }
                
            }
            
            if(count==0){
                System.out.print(i+" ");
                totalPrime++;
            }
            
            count = 0;
        }
        
        System.out.println("\nTotal prime number: "+totalPrime);
        
    }
}
