package learning.java.lesson_1;

public class Condition {

    public Boolean isPositive(int number){
        if(number>=0) return true;
        return false;
    }

    public void oddNumber(){
        //@ToDo знайти всі непарні числа від 0 до 10 (% ділення з остачею, != не дорівнює, == дорівнює)
    }

    public static void main(String[] args) {
        Condition condition = new Condition();
        condition.isPositive(1);
    }
}
