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
    }    
    public String afficherInfos(){
        return ("M/Me."+prenom+" "+nom+" est ne en " + anneNaiss + ", il/elle est " + etatcivil );
    }
    public int age(int anneNaiss){
        return 2025 - anneNaiss;
    }
    public void conjoint(ex4Personne p){
        if(this.conjoint == null && p.conjoint ==null){ 
            this.conjoint = p;
            p.conjoint = this;
            this.etatcivil = "marié(e)";
            p.etatcivil = "marié(e)";   
            System.out.println(this.prenom+ "  est maintenant marié(e) avec " + p.prenom + ".");
            System.out.println(p.prenom+ " est maintenant marié(e) avec " +this.prenom);}
            else{
                System.err.println("IMPOSSIBLE !");
            }
            

        }

        
    }

     class  TestPersonne {
        public static void main(String[] args) {
            ex4Personne p1 = new ex4Personne("Adem","Yazidi","celebataire",2005);
            ex4Personne p2 = new ex4Personne("anonyme ","marmar","comlexe",1940);
            ex4Personne p3 = new ex4Personne("sama","picaso","Amoureux",2010 );
            System.out.println("Info personne 1  "+p1.afficherInfos());
            System.out.println("Info personne 2  "+p2.afficherInfos());
            System.out.println("Info personne 3  "+p3.afficherInfos());
            p1.conjoint(p2);
            System.out.println(p1.afficherInfos());
            System.out.println(p2.afficherInfos());}
        }
           
        
    