
package practice_demo;

import java.util.Scanner;

public class ArmstorngNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        
        int temp, r, sum=0;
        
        temp = num;
        
        while(temp!=0){
            r = temp%10;
            sum += r*r*r;
            temp = temp/10;
        }
        
        System.out.println("Number: "+sum);
        
        if (sum==num) {
            System.out.println("The number is Armstrong");
        }
        else{
            System.out.println("The number is not Armstrong");
        }
            
    }
}
