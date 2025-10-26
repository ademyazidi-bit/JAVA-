package td3;

public class ex4Personne {
    private String nom;
    private String prenom;
    private String etatcivil;
    private int anneNaiss;
    private ex4Personne conjoint;
    public ex4Personne(String nom, String prenom, String etatcivil,int anneNaiss ){
        this.nom = nom;
        this.prenom = prenom;
        this.etatcivil = etatcivil;
        this.anneNaiss = anneNaiss;
        this.conjoint = null;
        System.out.println("Nouvelle personne construite .");
    }    
    public String afficherInfos(){
        return ("M/Me."+prenom+" "+nom+" est ne en " + anneNaiss + ", il/elle est " + etatcivil );
    }
    public int age(int anneNaiss){
        return anneNaiss - 2025;
    }
    public void conjoint(){
        
    }

    public class  TestPersonne {
        public static void main(String[] args) {
            ex4Personne p1 = new ex4Personne("Adem","Yazid","celebataire",2005);
            ex4Personne p2 = new ex4Personne("anonyme ","marmar","comlexe",1940);
            ex4Personne p3 = new ex4Personne("sama","picaso","Amoureux",2010 );
            System.out.println("Info personne 1  "+p1.afficherInfos());
            System.out.println("Info personne 2  "+p2.afficherInfos());
            System.out.println("Info personne 3  "+p3.afficherInfos());
        }}
    }