public class ShapeArray {
    public static void main(String[] args) {
        shape[] shapeArray = new shape[3];
        
        shapeArray[0] = new sphere(4); // Instantiate a sphere
        shapeArray[1] = new cylinder(8, 7); // Instantiate a cylinder
        shapeArray[2] = new cone(4, 3); // Instantiate a cone
        
        for (shape shape : shapeArray) {
            System.out.println(shape.toString());
        }
    }
}