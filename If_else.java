package basicTutorial;

import java.util.Scanner;

public class If_else {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        double num_1, num_2, result;
        
        System.out.print("Enter first number: ");
        num_1 = input.nextDouble();
        
        System.out.print("Enter second number: ");
        num_2 = input.nextDouble();
        
        char op;
        System.out.print("Enter any operator '+', '-', '*', '/', '%':: ");
        op = input.next().charAt(0);
        
        switch(op){
            case '+' -> {
                result = num_1 + num_2;
                System.out.printf("%.0f + %.0f = %.0f \n", num_1, num_2, result);
                break;
            }
            
            case '-' ->{
                result = num_1 - num_2;
                System.out.printf("%.0f - %.0f = %.0f \n" ,num_1, num_2, result);
                break;
            }
            
            case '*' -> {
                result = num_1 * num_2;
                System.out.printf("%.0f X %.0f = %.0f \n", num_1, num_2, result);
                break;
            }
            
            case '/' -> {
                result = num_1 / num_2;
                System.out.printf("%.0f / %.0f = %f \n", num_1, num_2, result);
                break;
            }
            
            case '%' -> {
                result = num_1 * (num_2/100);
                System.out.printf("%.0f %% %.0f = %.2f \n", num_1, num_2, result);
                break;
            }
            
            default -> System.out.println("This is not an operator");
        }
    }
}