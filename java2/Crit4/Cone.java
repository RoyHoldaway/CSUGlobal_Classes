public class cone extends shape {
    private double radius;
    private double height;

    public cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    
    // volume is found with pi r^3 * h/3
    public double volume() {
        return Math.PI * (radius * radius * radius) * (height / 3.0);
    }
    // surface area is found with pi * r * (r + sqrt(h^2 + r^2))
    public double surfaceArea() {
        return Math.PI * radius * (radius + Math.sqrt(height * height + radius * radius));
    }

    public String toString() {
        return "Cone:  Volume: " + volume() + " Surface area: " + surfaceArea();
    }
    
}