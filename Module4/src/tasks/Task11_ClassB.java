package tasks;

public class Task11_ClassB {
    public static void main(String[] args) {
        Task11_ClassA classA = new Task11_ClassA();

        String name = classA.getName("Mary");

        System.out.println(name);
    }
}
