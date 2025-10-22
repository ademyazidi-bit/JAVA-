package td3;
public class Personne {
    private String nom;
    private String prenom;
    private String adresse;
    private int age;
    public Personne(String lenom ){
        nom = lenom;
}   public Personne(String leprenom,int lage ){
        prenom = leprenom;
        age = lage ;  
}
    public Personne(String lenom, String leprenom, String ladresse, int lage){
        nom = lenom;
        prenom = leprenom;
        adresse = ladresse;
        age = lage;
    }
    public String getNom(){
        return nom;
    } 
    public String getPrenom(){
        return prenom;
    }
    public String getAdresse(){
        return adresse;
    }
    public int getAge(){
        return age;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    public void setAdresse(String adresse){
        this.adresse = adresse;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void anniversaire(int Ix){
        age +=Ix;
    }
    public String presenteToi(){
        return ("je m'appelle "+ getNom()+" "+ getPrenom()+"  J'ai  " + getAge()+ "  J'habite a   "+ getAdresse() );
    }
    public static void main(String[] args) {
        Personne p = new Personne("Adem", "Yazidi", "Manzel Bourguiba Bizerte", 19);
        System.out.println(p.presenteToi());
        
    }
}  
