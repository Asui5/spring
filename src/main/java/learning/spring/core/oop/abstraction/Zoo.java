package learning.spring.core.oop.abstraction;

public class Zoo {
    public static void main(String[] args) {
        Pet pet = new Cat();
        pet.eat();

        pet = new Fish();
        pet.eat();
    }
}
