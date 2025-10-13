public class ex3 {

    public static void main(String[] args) {
        int [] tab = new int[5];
        tab[0] = 5;
        tab[1]= 8;
        tab[2] = 7;
        tab[3] = 4;
        tab[4] = 2;
        int i;
        for( i = 0 ; i <tab.length; i++ ){
            System.out.println(tab[i]);
        }
        int min,max;
        int S = 0;
        min =tab[0];
        max= tab[0];
        for(int x : tab){
            System.out.println(x);
            S +=x;
            if (x>max){
                max = x;
            }
            if(x<min){
                min = x;

            }
            
        }
        System.out.println("la somme " + S);
        System.out.println(" max "+ max+" Min "+min);
        

    }
}