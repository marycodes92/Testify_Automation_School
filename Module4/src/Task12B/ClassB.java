package Task12B;

public class ClassB {
    public static void main(String[] args) {
        ClassB classb = new ClassB();

        int age = classb.getAge(40);

        System.out.println("You are "+ age + " old");
    }

//    getAge method is only accessible within this Class
    private int getAge(int age){
        return age;
    }
}
