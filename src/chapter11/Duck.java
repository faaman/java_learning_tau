package chapter11;

public class Duck extends Animal{
    @Override
    String makeSound() {
        System.out.println("Quack quack!");
        return null;
    }
}
