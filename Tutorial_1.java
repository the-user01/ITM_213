
package basicTutorial;

import java.util.Scanner;


public class Tutorial_1 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int x, sum=0;
        float avg;
        System.out.print("Enter the size of the array: ");
        x = input.nextInt();
        
        int [] arr = new int[x];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            
            sum += arr[i];
        }
            avg = sum/ arr.length;
            System.out.println("Sum: "+ sum);
            System.out.println("Average: "+ avg);
        
    } // Function ends
}