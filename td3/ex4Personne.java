package td3;

public class ex4Personne {
    private String nom;
    private String prenom;
    private String etatcivil;
    private int anneNaiss;
    private ex4Personne conjoint;
    private String sexe;
    private ex4Personne pere;
    private ex4Personne mere;

    public ex4Personne(String nom, String prenom, String etatcivil, int anneNaiss, String sexe, ex4Personne pere, ex4Personne mere) {
        this.nom = nom;
        this.prenom = prenom;
        this.etatcivil = etatcivil;
        this.anneNaiss = anneNaiss;
        this.conjoint = null;
        this.sexe = sexe;
        this.pere = pere;
        this.mere = mere;
    }

    public String afficherInfos() {
        String info = "";
        if (this.etatcivil.equals("marié(e)") && this.conjoint != null) {
            if (this.sexe.equals("F")) {
                info = "Mme " + conjoint.nom + " née " + this.nom + " " + this.prenom +
                        " est née en " + anneNaiss + ", elle est " + etatcivil + ".";
            } else if (this.sexe.equals("M")) {
                info = "M. " + this.nom + " " + this.prenom +
                        " est né en " + anneNaiss + ", il est " + etatcivil + ".";
            }
        } else {
            if (this.sexe.equals("F")) {
                info = "Mlle " + this.nom + " " + this.prenom +
                        " est née en " + anneNaiss + ", elle est " + etatcivil + ".";
            } else if (this.sexe.equals("M")) {
                info = "M. " + this.nom + " " + this.prenom +
                        " est né en " + anneNaiss + ", il est " + etatcivil + ".";
            }
            if (this.pere != null) {
                info += " Père : " + this.pere.nom + " " + this.pere.prenom + ".";
            }
            if (this.mere != null) {
                info += " Mère : " + this.mere.nom + " " + this.mere.prenom + ".";
            }
        }
        return info;
    }

    public int age() {
        return 2025 - this.anneNaiss;
    }

    public void marier(ex4Personne p) {
        if (this.conjoint == null && p.conjoint == null) {
            this.conjoint = p;
            p.conjoint = this;
            this.etatcivil = "marié(e)";
            p.etatcivil = "marié(e)";
            System.out.println(this.prenom + "  est maintenant marié(e) avec  " + p.prenom + ".");
            System.out.println(p.prenom + " est maintenant marié(e) avec " + this.prenom + ".");
        } else {
            System.err.println("IMPOSSIBLE !");
        }
    }

    public static void main(String[] args) {
        ex4Personne p1 = new ex4Personne("Yazidi", "Adem", "celebataire", 2005, "M", null, null);
        ex4Personne p2 = new ex4Personne("anonyme", "marmar", "comlexe", 1940, "F", null, null);
        ex4Personne p3 = new ex4Personne("sama", "picaso", "Amoureux", 2010, "F", p1, p2);
        p1.marier(p2);
        System.out.println("Info personne 1  " + p1.afficherInfos());
        System.out.println("Info personne 2  " + p2.afficherInfos());
        System.out.println("Info personne 3  " + p3.afficherInfos());
    }
}
