package code;

public class Circle {

    private double x;
    private double y;
    private double r;

    public Circle(Punto punto,double r){
        this.setX(punto.getX());
        this.setY(punto.getY());
        this.setR(r);
    }

    public double distance(Circle other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.hypot(dx, dy);
    }

    public boolean intersects(Circle other) {
        return this.distance(other) < this.r / 2 + other.r / 2;
    }

    public double getX() { return x; }
    public double getY() { return y; }
    public double getR() { return r; }

    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
    public void setR(double r) { this.r = r; }
}

