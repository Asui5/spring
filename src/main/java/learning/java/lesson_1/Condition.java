package learning.java.lesson_1;

public class Condition {

    public Boolean isPositive(int number){
        if(number>=0) return true;
        return false;
    }

    public static void main(String[] args) {
        Condition condition = new Condition();
        condition.isPositive(1);
    }
}
