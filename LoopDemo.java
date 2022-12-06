
package practice_demo;

public class LoopDemo {
    public static void main(String[] args) {
        
        int i;
        
        // For loop
        /*
        for(i=1; i<=10; i++){
            System.out.println(i+ " Bangladesh");
        }
        */
        
        // While loop
        /*
        i = 2;
        
        while(i<=100){
            
            System.out.println(i);
            i+=2;
        }
        */
        
        // Do while loop
        /*
        i = 1;
        
        do{
            System.out.println(i+" Bangladesh");
            i++;
            
        }while(i<=10);
        */
        
        for(i=1; i<=100; i+=3){
            if (i==10) {
                continue;
            }
            if(i>13){
                break;
            }
            
            System.out.println(i);
        }
        
        
        
    }
}
