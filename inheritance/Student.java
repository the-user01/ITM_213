
package inheritance;

public class Student extends Person {
    int roll;
    
    Student(String name, int age, int roll){
        this.name = name;
        this.age = age;
        this.roll = roll;
    }
    
    void studentDisplay(){
        displayInfo1();
        System.out.println("Roll: "+roll );
    }
}
