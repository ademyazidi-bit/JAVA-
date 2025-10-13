import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Combien de ligne");
        x = sc.nextInt();
        for(int i =1;i<x* 2 ;i+=2){
            System.out.println("*".repeat(i));
        }
    }
}
