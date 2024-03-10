public class cylinder extends shape{
    private double radius;
    private double height;

    public cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    } 
    // volume is found with pi * r^2 * h
    public double volume() {
        return Math.PI * (radius * radius) * height;
    }
    // surface area is found with 2 * pi * r * h + 2 * pi * r^2
    public double surfaceArea() {
        return (2 * math.pi * radius * height) + (2 * Math.PI * (radius * radius));
    }

    public string toString() {
        return "Cylinder: Volume: " + volume() + " Surface area: " + surfaceArea();
    }
}