
package practice_demo;
import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Convert into Farenheit
        
        double cels, farn;
        System.out.print("Celsius: ");
        cels = input.nextDouble();
        
        farn = 1.8 * cels + 32;
        System.out.println("Farenheit: "+farn);
        
        // Convert into Celsius
        
        double farenheit, celsius;
        
        System.out.print("Farenheit: ");
        farenheit = input.nextDouble();
        
        celsius = ((farenheit-32)*5)/9;
        
        System.out.println("Celsius: "+ celsius);
        
    }
    
}
