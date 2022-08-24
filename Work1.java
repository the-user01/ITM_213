package class_work;

import java.util.Scanner;

public class Work1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter any number: ");
        int num = input.nextInt();
        
        for (int i = 1; i <= num; i++) {
            System.out.println(i+"^"+3+" = "+(i*i*i));
        }
    }
}
