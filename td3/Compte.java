package td3;

import td2.point;
// EX3
// EX3
// EX3
// EX3
// EX3
// EX3
public class Compte {
    private int solde;
    private String titulaire;
    public Compte(){  
        solde = 0;   
    }
    public void ouvrirCompte(String nom){
        titulaire = nom;
    }
    public void deposerArgent(int somme ){
        solde += somme;
    }
    public void transfererArgent(int somme , Compte c){
        solde = solde - somme;
        c.solde += somme;
    }
    public int getSolde(){
        return solde;
    }
    public void afficherCompte(){
        System.out.println("Nom Titulaire de compte : " + titulaire+ " Solde "+ solde);
    }
    public class  TestCompte {
        public static void main(String[] args) {
            Compte c1 = new Compte();
            Compte c2 = new Compte();
            c1.ouvrirCompte("Adem");
            c2.ouvrirCompte("7assen");
            c1.deposerArgent(200);
            c2.deposerArgent(300);
            c1.transfererArgent(150,c2);
            c2.transfererArgent(100,c1);
            c1.getSolde();
            c2.getSolde();
            c1.afficherCompte();
            c2.afficherCompte();


        }
    
        
    }
    
}   
