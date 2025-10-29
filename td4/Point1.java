package td4;

import td2.point;
// EX1
// EX1
// EX1
// EX1
// EX1

public class Point1 {
    private int x;
    private int y;
    public void initialise(int x,int y){
        this.x = x;
        this.y = y;

    }   
    public void deplace(int dx , int dy){
        x+= dx;
        y+= dy;
    }     
    public int getX(){
        return x;}
    public int getY(){
        return y;
    }
    public void affich(){
        System.out.println("X = "+ getX()+" Y =  " + getY());
    }

}
 class PointA extends Point1{
    public PointA(){
        
        
    }
    public static void main(String[] args) {
        Point1 p = new Point1();
        p.initialise(5, 4);
        PointA pa = new PointA();
        pa.initialise(7, 3);
        p.affich();
        pa.affich();
        }
    }





