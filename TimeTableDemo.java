
package practice_demo;

import java.util.Scanner;

public class TimeTableDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int first_num,last_num, i, j;
        
        System.out.print("Enter initial number: ");
        first_num = input.nextInt();
        
        System.out.print("Enter last number: ");
        last_num = input.nextInt();
        
        System.out.println();
        
        for (i= 1; i <= 10; i++) {
            
            for (j = 1; j <= 10; j++) {      
                
            System.out.println(i+" x "+j+ " = "+i*j);
            
            }
            
            //System.out.println("\n");
        }
        
                
                
    }
    
}
