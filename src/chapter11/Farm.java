package chapter11;

public class Farm {
    public static void main(String[] args){
        Animal duckie = new Duck();
        duckie.eat();
        duckie.makeSound();
        Animal goat = new Goat();
        goat.eat();
        goat.makeSound();
    }
}
