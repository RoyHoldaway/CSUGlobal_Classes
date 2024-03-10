public class sphere extends shape {
    private double radius;

    public sphere(double radius){
        this.radius = radius;
    } 
    // Volume is found with the equation 4/3 * pi * r^3
    public double volume() {
        return (4.0 / 3.0) * Math.PI * (radius * radius * radius);
    }
    // surface area is found with the equation 4 * pi * r^2
    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    public string toString() {
        return "Sphere: Volume: " + volume() + " Surface area: " + surfaceArea();
    }

}