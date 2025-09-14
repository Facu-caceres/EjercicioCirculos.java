package code;

public class Main {

    public static void main(String[] args) {
        Circle c1 = new Circle(new Punto(0,0),1);
        Circle c2 = new Circle(new Punto(1,1), 1.5);

        System.out.println("Distancia entre c1 y c2: " + c1.distance(c2));
        System.out.println("¿Se intersecan? " + c1.intersects(c2));
    }
}