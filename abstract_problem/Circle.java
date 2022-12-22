package abstract_problem;

public class Circle extends Shape {
    
    Circle(double r){
        super(r,r);
    }
    
    @Override
    void area(){
        double result = 3.1416f * dim1*dim2;
        System.out.println("Circle area: "+result);
    }
    
}
