package learning.spring.core.oop.inheritance;

public class CatZoo {
    public static void main(String[] args) {
        CatFamily cat = new Lion();
        cat.eat();

        cat = new HomeCat();
        cat.eat();
    }
}
