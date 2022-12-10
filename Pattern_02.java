
package practice_demo;

import java.util.Scanner;

public class Pattern_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int num = input.nextInt();
        
        // Pattern 01
        /*
        for (int row = 1; row <= num; row++) {
            
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        } */
        
        
        // Pattern 02
        /*
        for (int row = 1; row <= num; row++) {
            
            for (int col = 1; col <= row; col++) {
                System.out.print(row);
            }
            System.out.println();
        }  */
        
        
        // Pattern 03
        /*
        for (int row = 1; row <= num; row++) {
            
            for (int col = 1; col <= row; col++) {
                if (col%2==1) {
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }  */
        
        // Pattern 04
        /*
        for (int row = 1; row <= num; row++) {
            
            for (int col = 1; col <= row; col++) {
                if (row%2==1) {
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            
            
            System.out.println();
        } */
        
        for (int row = 1; row <= num; row++) {
            
            for (int col = 1; col <= row; col++) {
                
                System.out.print((char)(row+64));
            }
            
            
            System.out.println();
        } 
    }
    
}
