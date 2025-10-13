import java.util.Random;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("entrez un nombre ( 1 - 10 )");
        a = sc.nextInt(); 
        Random rand = new Random();
        int nb  = rand.nextInt(11);
        if (a== nb){
            System.out.println("U win !!!");

            
        }
        else{
            System.out.println("U are unlucky mate !!!");

        }
    }
}
