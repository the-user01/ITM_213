
package practice_demo;

import java.util.Random;

public class Random_number {
    public static void main(String[] args) {
        Random rand = new Random();
        
        int randomNumber = rand.nextInt(10); // 0-9
        int randomN = rand.nextInt(10) + 1; // 1-10
        int randomNum = rand.nextInt(6) + 5; // 5-10
        
        System.out.println("Random number: "+ randomNumber);
        System.out.println("Random number: "+ randomN);
        System.out.println("Random number: "+ randomNum);
        
        int random = (int) (Math.random()*10); // 0-10
        int randomian = (int) (Math.random()*10)+1; // 1-10
        
        System.out.println(" New Random System: "+random);
        System.out.println(" New Random System: "+randomian);
        
    }
}
