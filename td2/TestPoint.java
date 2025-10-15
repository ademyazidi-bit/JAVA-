package td2;
// ex 5 
// ex 5
// ex 5
// ex 5
// ex 5
class Point {
private double x; // abscisse
       private double y; // ordonnee
       public Point( int abs, int ord) {
              x = abs;
              y = ord;}
       public void deplace(int dx, int dy) {
              x += dx;
              y += dy;}
       public double  abscisse(){
              return x;
       }
       public double ordonnee(){
              return y;
       }

       }

public class TestPoint {
       public static void main(String args[]) {
              Point a;
              a = new Point(3, 5);
              System.out.println("L'abscisse : " + a.abscisse());
              System.out.println("L'ordonnee : " + a.ordonnee());
              a.deplace(2, 0);
              System.out.println("L'abscisse : " + a.abscisse());
              System.out.println("L'ordonnee : " + a.ordonnee());
              Point b = new Point(6, 8);
              System.out.println("L'abscisse : " + a.abscisse());
               System.out.println("L'ordonnee : " + a.ordonnee());
              }
}