package Task12A;

public class ClassA {
//    Create two packages. in each of the packages create one
//    class each Class A and Class B. create a method in class
//    A that can be accessed anywhere in that project and create
//    a method in Class B that can only be accessed within a class.
    public static void main(String[] args) {
        ClassA classa = new ClassA();

        classa.myPublicMethod();
    }
    public void myPublicMethod(){
        System.out.println("This Method is accessible from anywhere in the project");
    }
}
