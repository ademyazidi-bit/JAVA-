package td2;
// EX N1
// EX N1
// EX N1
// EX N1 
public class point {
        private char  nom ;
        private double abscisse;
    public point(char nom, double abscisse){
        this.nom = nom;
        this.abscisse = abscisse;
    }
    public void affiche(){
        System.out.println("le nom : " + nom );
        System.out.println("l'abscisse : " + abscisse);

    }
    public void translate(double dx){
        abscisse = abscisse +dx;

    }
    public static void main(String[] args) {
        // public Point () :  constructeur vide par default
        point p = new point('A' ,5);
        p.affiche();
        p.translate(2);
        p.affiche();
    }
}
