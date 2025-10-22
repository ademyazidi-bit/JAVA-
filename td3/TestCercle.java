package td3;

import java.awt.Color;

// Classe Point2d (first, as in your original)
class Point2d {
    double x;
    double y;

    public Point2d() {
        x = 0.0;
        y = 0.0;
    }

    public Point2d(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

// Classe Cercle (second)
class Cercle {
    Point2d centre;
    double rayon;
    Color couleur;

    public Cercle() {
        this.centre = new Point2d();
        rayon = 2.0;
        couleur = Color.RED;
    }

    public Cercle(double r, Color c) {
        this.centre = new Point2d();
        this.rayon = r;
        this.couleur = c;
    }

    public void move(double x, double y) {
        this.centre.x += x;
        this.centre.y += y;
    }

}

// Classe TestCercle (third)
public class TestCercle {
    public static void main(String[] args) {
        Cercle c1 = new Cercle();
        Cercle c2 = new Cercle(5, Color.BLACK);
        c1.move(5, 2);
        c2.move(3, 4);
        System.out.println("C1"+c1);
        System.out.println("C2"+c2);

       
    }
}
