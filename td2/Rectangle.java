package td2;
// EX 3
// EX 3
// EX 3
// EX 3
// EX 3


public class Rectangle {
    private float longueur;
    private float largeur ;
    public Rectangle (float lar, float lon){
        largeur = lar ;
        longueur = lon;

    }
    public Rectangle (){
        longueur = 10;
        largeur = 5;
    }
    public float getPerimetre () {
        return (largeur + longueur) * 2;
    }
    public float getSurface (){
        return largeur * longueur;
    }
    public void afficher() {
        System.out.println("longueur : " + longueur + " largeur : " + largeur);
        System.out.println(" Perimetre  " + getPerimetre());
        System.out.println(" Surface : " + getSurface());

    }
    public void modifierRectangle(float lar, float lon){
        largeur = lar;
        longueur = lon; 
    }
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(7,4);
        System.out.println(" les dimensions de R1  : " );
        r1.afficher();
        Rectangle r2 = new Rectangle();
        System.out.println(" les dimensions de R2  : " );
        r2.afficher();
        r1.modifierRectangle(6,8);
        System.out.println(" les dimensions de R1 après la modification : " );
        r1.afficher();

        
    }
}
