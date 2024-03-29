package tasks;

//You are to create 3 variables for a "square shape"
// class which will be "class A", shapeSides (number of sides of the shape),
// shape length and shape breadth. From your knowledge of encapsulation,
// create getters and setters for lenght and breadth variables and create
// only a getter for shape side(this is becasue we dont want anyone setting
// the sides of a square. the sides of the square must and always will be 4)
// Create another class "B", set the values of length and breadth. Get the value
// of the length and breadth and calculate the area. print out your final calculation
// like this. "The area of a sqaure of length: {put the value of the length} and
// breadth {put the value of the breadth} is {put the value of the area u calculated}"

public class Task14_ClassA_SquareShape {
    private int shapeSides = 4;
    private int shapeLength;
    private int shapeBreadth;

    public int getShapeSides() {
        return shapeSides;
    }

    public int getShapeLength() {
        return shapeLength;
    }

    public void setShapeLength(int shapeLength) {
        this.shapeLength = shapeLength;
    }

    public int getShapeBreadth() {
        return shapeBreadth;
    }

    public void setShapeBreadth(int shapeBreadth) {
        this.shapeBreadth = shapeBreadth;
    }
}
