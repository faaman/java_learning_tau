package edxClasses;

public class Insect {

    //instance variables
    private double weight;
    private int x, y;

    //constructor
    public Insect(double initWeight, int initX, int initY){
        weight = initWeight;
        x = initX;
        y = initY;
    }

    public Insect() { }

    //test method
    public static void main(String[] args){
        Insect fly = new Insect(1.6,2,3);
        System.out.println("fly is this heavy: " + fly.weight);
        Insect ladybug = new Insect(2.3,4,6);
        Insect beetle = new Insect();
    }
}
