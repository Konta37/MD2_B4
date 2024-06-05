package BTVN.B7;

public class Circle {
    private double circleRadius = 1;
    private String circleColor = "red";

    public Circle(){};

    public double getCircleRadius() {
        return circleRadius;
    }

    public void setCircleRadius(double circleRadius) {
        this.circleRadius = circleRadius;
    }

    public String getCircleColor() {
        return circleColor;
    }
    //
    private double getArea() {
        return circleRadius * circleRadius * Math.PI;
    }

    public String display(){
        return "radius: " + circleRadius + " color: " + circleColor + " area: " + getArea();
    }
}
