package tasks;

// OVERLOADING: Create a method in a class and Overload in using the
// 3 different ways of overloading that you know.
public class Task16A {
    public static void main(String[] args) {
//        Task16A courses = new Task16A();
//
//        courses.computerScience("sta");
//        courses.computerScience("com", "com2");
//        courses.statistics("sta", 3);
//        courses.statistics("nfjks", 3);
    }

    //    Overloading by Number of Parameters
    public void computerScience(String course1) {
        System.out.println("Java");
    }

    public void computerScience(String course1, String course2) {
        System.out.println("Java 123");
    }

    //    Overloading by Data Type Parameters
    public void statistics(String course1, String course2) {
        System.out.println("Maths and Stat 101");
    }

    public void statistics(String course1, int courseCode) {
        System.out.println("STAT 102");
    }

    //    Overloading by Sequence of Data type Parameter
    public void microbiology(String course1, int courseCode) {
        System.out.println("GEO 202");
    }
    public void microbiology(int courseCode, String course1) {
        System.out.println("202 GEO");
    }
}
