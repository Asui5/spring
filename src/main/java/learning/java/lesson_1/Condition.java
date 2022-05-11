package learning.java.lesson_1;

public class Condition {

    public Boolean isPositive(int number){
        //@TODO return true if number is positive
        if(number>=0) return true;
        return false;
    }

    public static void main(String[] args) {
        Condition condition = new Condition();
        condition.isPositive(1);
    }
}
