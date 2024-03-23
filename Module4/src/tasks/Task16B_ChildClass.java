package tasks;

public class Task16B_ChildClass extends Task16B_ParentClass{
    public static void main(String[] args) {
        Task16B_ChildClass students = new Task16B_ChildClass();

        students.department("some course", 542);
        students.sports("basketballer");

    }

    public void department(String courses, int code){
        System.out.println("Chidinma is in Statistics department");
    }

    public void sports(String type){
        System.out.println("Obi is a Basket player");
    }
}

