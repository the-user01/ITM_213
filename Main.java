
package basicTutorial;

import java.util.Scanner;
public class Main{
  
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
      
     int num, count=0;;
     
     num = input.nextInt();
     
      for (int i = 1; i <= num; i++) {
          
          for (int j = 2; j < i; j++) {
              
              if(i%j ==0){
                  count++;
                  break;
              }
          }
           
              if(count == 0){
                  System.out.println(i+" ");
              }
              
              count = 0;
      }
              
  }
  
}