package ObjectClass;


public class Classed {
    
    private String name, address;
    private int roll;
    private float cgpa;
    
    public String getName(){
        return name;
    }
    
    public int getRoll(){
        return roll;
    }
    
    public float getCgpa(){
        return cgpa;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setClassing(String n, int r, float cg, String add){
        name = n;
        roll = r;
        cgpa = cg;
        address = add;
    }
   
    void display_1(){
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
        System.out.println("Cgpa: "+cgpa);
        System.out.println("Address: "+address);
        
    }
    
     
} 
