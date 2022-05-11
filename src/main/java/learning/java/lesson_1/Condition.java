package learning.java.lesson_1;

public class Condition {

    public Boolean isPositive(int number){
        if(number>=0) return true;
        return false;
    }

    public void oddNumber(){
        //@ToDo знайти всі непарні числа від 0 до 10 (% ділення з остачею, != не дорівнює, == дорівнює)
        for (int i=0;i<=10;i++){
            if(i%2!=0)
                System.out.println(i);
        }

    }
    public void tenNumber(){
        for (int i=0;i<10;i++)
        System.out.println(i);
    }
//    public void allNumbers(){
//        int i=0;
//        do {
//            System.out.println(i++);
//        }while(i<10);
//    }

    public static void main(String[] args) {
        Condition condition = new Condition();
        condition.isPositive(1);
        //condition.oddNumber();
//        condition.allNumbers();
        condition.tenNumber();
    }
}
