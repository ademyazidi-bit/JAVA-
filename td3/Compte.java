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
        if (somme >0 ){
        solde += somme;}
        else {  System.out.println("erreur .");
    }
    }
    public void transfererArgent(int somme , Compte c){
        if (somme > 0 && this.solde >= somme){
        this.solde -= somme;
        c.deposerArgent(somme);
    } else {
        System.out.println("Erreur");
    }
    }
    public int getSolde(){
        return solde;
    }
    public void afficherCompte(){
        System.out.println("Nom Titulaire de compte : " + titulaire+ " ; Solde "+ solde);
    }
    public class  TestCompte {
        public static void main(String[] args) {
            Compte c1 = new Compte();
            Compte c2 = new Compte();
            Compte c3 = new Compte();
            c1.ouvrirCompte("Adem");
            c2.ouvrirCompte("7assen");
            c3.ouvrirCompte("7amouda");
            c1.deposerArgent(200);
            c2.deposerArgent(300);
            c3.deposerArgent(150);
            c1.transfererArgent(150,c2);
            c2.transfererArgent(100,c1);
            c1.getSolde();
            c2.getSolde();
            c3.getSolde();
            c1.afficherCompte();
            c2.afficherCompte();
            c3.afficherCompte();


        }
    
        
    }
    
}   
