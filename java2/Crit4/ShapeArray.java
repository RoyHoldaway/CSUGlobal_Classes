public class ShapeArray {
    public static void main(String[] args) {
        Shape[] shapeArray = new Shape[3];
        
        shapeArray[0] = new sphere(4); // Instantiate a sphere
        shapeArray[1] = new cone(7, 3); // Instantiate a cylinder
        shapeArray[2] = new cylinder(4, 8); // Instantiate a cone
        
        for (Shape shape : shapeArray) {
            System.out.println(shape.toString());
        }
    }
}
