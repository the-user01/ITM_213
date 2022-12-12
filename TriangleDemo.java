
package practice_demo;
import java.util.Scanner;

public class TriangleDemo {
    public static void main(String[] args) {
                
        Scanner input = new Scanner(System.in);
        
        // Area of a Triangle
        
        double base, height;
        
        System.out.print("Enter base: ");
        base = input.nextDouble();
        
        System.out.print("Enter height: ");
        height = input.nextDouble();
        
        double area = 0.5 * base * height;
        
        System.out.println("Area of a Triangle: "+area);
        
        // Area of a Circle
        
        double r, c_area;
        
        System.out.print("Enter radius: ");
        r = input.nextDouble();
        
        c_area = 3.1416 * r*r;
        
        System.out.println("Area of a circle: "+c_area);
        
    }
}
