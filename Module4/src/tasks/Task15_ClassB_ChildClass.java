package tasks;

public class Task15_ClassB_ChildClass extends Task15_ClassA{
    public static void main(String[] args) {
        Task15_ClassB_ChildClass courses = new Task15_ClassB_ChildClass();

        courses.computerScience();
        courses.psychology();
        courses.statistics();
        courses.java();
        courses.maths();

    }

    void maths(){
        System.out.println("We would have Maths class later today");
    }

    void java(){
        System.out.println("Java is one of the courses in our Computer Science curriculum");
    }
}
