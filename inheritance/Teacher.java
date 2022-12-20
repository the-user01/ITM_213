
package inheritance;

public class Teacher extends Person {
    
    String gender;
    
    Teacher(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    void anotherDisplay(){
        displayInfo1();
        System.out.println("Gender: "+gender);
    }
}
