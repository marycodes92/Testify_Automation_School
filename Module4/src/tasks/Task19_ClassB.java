package tasks;

public class Task19_ClassB extends Task19_ClassA_Super{
    String name = "Anderson";

    public static void main(String[] args) {
        Task19_ClassB object = new Task19_ClassB();

        System.out.println("The value of class A is: " + object.name);
        object.printName("Ade");
    }

    public void printName(String name){
        System.out.println("The value of Class A: " + super.name);
    }
}
