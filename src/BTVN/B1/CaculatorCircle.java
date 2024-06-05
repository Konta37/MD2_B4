package BTVN.B1;

public class CaculatorCircle {
    double radius;
    String colorCircle;

    public CaculatorCircle() {}
    public CaculatorCircle(double radius, String colorCircle) {
        this.radius = radius;
        this.colorCircle = colorCircle;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColorCircle() {
        return colorCircle;
    }

    public void setColorCircle(String colorCircle) {
        this.colorCircle = colorCircle;
    }

    public double areaCircle(double radius) {
        return Math.PI * radius * radius;
    }

    public double perimeterCircle(double radius) {
        return 2 * Math.PI * radius;
    }

    public String display(){
        return "Hinh tron co mau: " + colorCircle + " va ban kinh: "  + radius;
    }

}
