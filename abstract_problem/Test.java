package abstract_problem;

public class Test {
    public static void main(String[] args) {
        Shape shape;
        
        shape = new Rectangle(10,20);
        shape.area();
        
        shape = new Triangle(10,20);
        shape.area();
        
        shape = new Circle(5);
        shape.area();
        
    }
    
}