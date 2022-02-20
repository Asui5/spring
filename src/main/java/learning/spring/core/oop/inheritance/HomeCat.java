package learning.spring.core.oop.inheritance;

public class HomeCat extends CatFamily{
    @Override
    public void eat() {
        System.out.println("Korm");
    }

    @Override
    void jump() {
        System.out.println("jumping up");
    }
}
