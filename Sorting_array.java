
package basicTutorial;

public class Sorting_array {
    
    public static void main(String[] args) {
        int[] arr = {12,5,56,-2,32,2,-26,9,43,94,-78};
        
        for (int i = 0; i < arr.length; i++) {
            
            for (int j = i+1; j < arr.length; j++) {
                
                int temp = 0;
                
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    
                }
                
            }
            
            for (i = 0; i < arr.length; i++) {
                
            System.out.print(arr[i]+" ");
            }
            
        }
        
        
        
        
    }
    
}
