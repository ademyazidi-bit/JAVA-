package td3;

import java.awt.Color;
// EX1
// EX1
// EX1
// EX1
// EX1
class Point2d {
    double x;
    double y;

    public Point2d() {

    }

    public Point2d(double x, double y) {
        this.x = x;
        this.y = y;
    }

public double getx(){
    return x;
}
public double gety(){
    return y;
}
public void setx(double x){
    this.x = x;

}
public void sety(double y){
    this.y= y;

}}


 class Cercle {
    Point2d centre;
    private double rayon;
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
    public Cercle(Point2d p, Color c, double r){
        this.rayon = r;
        this.couleur = c;
        this.centre = p;
    }

    public void move(double x, double y) {
        this.centre.setx(this.centre.getx()+ x);
        this.centre.sety(this.centre.gety()+y);
    }
    
    
    public void affiche(){
        System.out.println("X = "+ centre.getx()+"Y = "+ centre.gety()+"couleur + "+couleur+"Rayon : "+ rayon);
        

    }
   // public void affiche(){
   //     centre.affiche();
      //  System.out.println("couleur"+ couleur+" Rayon " +rayon);
    //}

}

public class TestCercle {
    public static void main(String[] args) {
        Point2d p = new Point2d();
        Cercle c1 = new Cercle();
        Cercle c2 = new Cercle(5, Color.BLACK);
        Cercle c3 = new Cercle(p,Color.GRAY,2.5);
        c1.move(5, 2);
        c2.move(3, 4);
        c1.affiche();
        c2.affiche();;

       
    }
}
