
package practice_demo;

import java.util.Scanner;

public class PatternDemo_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int row, col, num, space;
        
        System.out.print("Enter number of rows: ");
         num = input.nextInt();
        
        for ( row = 1; row <= num; row++) {
            
            for (space = num-1; space >= row; space--) {
                System.out.print(" ");
            }
            
            for (col = 1; col <= row; col++) {
                System.out.print( "* ");
            }
            
            System.out.println();
        }
        
    }
}
