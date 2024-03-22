package tasks;

// Create 3 different constructors of a class A. Create 3 objects of
// Class A in class B and use the 3 different constructors when creating
// each of the objects of class A in class B
public class Task13_ClassA {
    String color;
    int seats;
    int tires;

    public Task13_ClassA(String carColor ){
        color = carColor;
    }

    public Task13_ClassA(String carColor, int carSeats){
        seats = carSeats;
    }

    public Task13_ClassA(String carColor, int carSeats, int carTires){
        tires = carTires;
    }

    String moving(String action ){
        return action;
    }
}
