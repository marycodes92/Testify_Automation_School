package tasks;

public class ClassB {
    public static void main(String[] args) {
        ClassA classA = new ClassA();

        String name = classA.getName("Mary");

        System.out.println(name);
    }
}
