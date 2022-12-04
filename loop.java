
package basicTutorial;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        /*
        char z;
        z = input.nextLine().charAt(0);
        
        System.out.println(z); 
        */
        
        int num, row, space,col;
        
        System.out.print("Enter number of rows: ");
        num = input.nextInt();
        
        for (row = 0; row <=num; row++) {
             
            for (space = num; space >= row; space--) {
                System.out.print(" ");
            }
            
            for (col = 1; col <= row; col++) {
                //System.out.print(col+" ");
                
                if(col%2==1){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
                
            }
            System.out.println();
        }
        
        
        for (row = 1; row <=num ; row++) {
            
            for (space = 1; space <= row; space++) {
                System.out.print(" ");
            }
            
            for (col = num; col >= row; col--) {
                //System.out.print(col+" ");
                
                if(col%2==1){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
                
            }
            System.out.println();
        }
        
    }
}