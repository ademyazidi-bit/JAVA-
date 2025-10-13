import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        String prenom;
        Scanner sc = new Scanner(System.in);     
        System.out.println("entrez votre Prenom : ");
        prenom = sc.nextLine(); 
        System.out.println("Upper : " + prenom.toUpperCase());
        System.out.println("lenght : " + prenom.length());
        System.out.println("first letter : " + prenom.charAt(0));
    }
}
