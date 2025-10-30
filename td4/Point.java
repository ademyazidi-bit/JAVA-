package td4;

// EX2
// EX2
// EX2
// EX2
// EX2


public class Point {
    private int x;
    private int y;
    
    public Point(int x, int y){
        this.x = x;
        this.y = y;
        
    }
    public void affCoor(){
        System.out.println("Coordonnes : " + x + " " + y);
    }
    public int getx(){
        return x;}
    public int gety(){
        return y;
    }}
 class PointNom extends Point{
    private char nom;
    public PointNom(int x ,int y, char nom){
        super(x, y);
        this.nom = nom;
    }
    public void affCoordNom(){
        //System.out.println  (" X : " + getx() +" Y : " + gety()+ " Nom : " + nom);//
        super.affCoor();
        System.out.println("Nom : " + this.nom) ;
    }
 


public static void main(String[] args) {
    Point p = new Point(4, 7);
    PointNom pn = new PointNom(4, 7, 'd');
    pn.affCoordNom();
}
 }

