package td2;
// EX N2
// EX N2
// EX N2
// EX N2
// EX N2
// EX N2
public class Segment {
        private int extr1;
        private int extr2;
    public Segment (int extr1,int  extr2){
        this.extr1 = extr1;
        this.extr2 = extr2; 
    } 
     public int longueur() {
        return Math.abs(extr2 - extr1);  

    }
    public String toString() {
    return "Segment : [" + extr1 + ", " + extr2 + "], longueur = " + longueur();
}
public class EssaiSegment{
                
public static void main(String[] args) {
    Segment s = new Segment(6,2);
    System.out.println("longueur :" + s.longueur());
    System.out.println(s.toString());
    

}
}
}