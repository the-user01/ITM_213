
package basicTutorial;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_list {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ArrayList<Integer> num = new ArrayList<Integer>();
        
        num.add(input.nextInt());
        num.add(input.nextInt());
        
        for (int i = num.size()-1; i >= 0; i--) {
            System.out.println(num);
        }
        
    }
    
}
