
package inheritance;

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("kxkxc", 39, "Male");
        Student s1 = new Student("lalalla", 22, 47);
        
        t1.anotherDisplay();
        System.out.println();
        
        s1.studentDisplay();
        
    }
}
