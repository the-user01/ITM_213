
package practice_demo;

public class MathDemo {
    public static void main(String[] args) {
        
        int x,y,z,a,b, max, min, absolute, round;
        double power, pi;
        
         x = 20;
         y = 10;
         z = -5;
         a = 2;
         b = 3;
        
         max = Math.max(x, y);
         min = Math.min(x,y);
         absolute = Math.abs(z);
         power = Math.pow(a,b);
         round = Math.round(8.8f);
         pi = Math.PI;
         
         System.out.println("Maximum: "+max);
         System.out.println("Minimum: "+min);
         System.out.println("Absolute: "+absolute);
         System.out.println("x to the power y: "+power);
         System.out.println("round value: "+round);
         System.out.println("PI: "+pi);
         
    }
    
}
