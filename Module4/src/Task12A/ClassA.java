package Task12A;

public class ClassA {
    public static void main(String[] args) {
        ClassA classa = new ClassA();

        classa.myPublicMethod();
    }
    public void myPublicMethod(){
        System.out.println("This Method is accessible from anywhere in the project");
    }
}
