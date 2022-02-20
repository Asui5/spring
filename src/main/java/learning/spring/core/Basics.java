package learning.spring.core;

//OOP
//Exception
//Collection

// об'єкт: НазваКласу назваОб'єкту = new Конструктор(...);
// метод: модифікатор типПовернення назваМетода(параметр1, параметр2, ...){те що метод робить}
// конструктор: НазваКласу(параметр1, параметр2, ....){те що робиться з об'єктом при створенні}
// доступ через .

public class Basics {
    private static void condition(int a, int b){
        if (a > b) System.out.println("a bigger");
        else if (a < b) System.out.println("b bigger");
        else System.out.println("equals");
    }

    public void forCycle() {
        for (int i = 0; i <=10; ++i) {
            System.out.println(i);
        }
    }

    public void whileCycle(){
        int i = 0;
        while (i<=10){
            System.out.println(i);
            i++;
        }
    }

    public void doWhileCycle(){
        int i = 11;
        do {
            System.out.println(i);
            i++;
        } while (i<=10);
    }

    public int[] array(int a[]) {
        for (int i = 0; i < a.length; i++){
            a[i] = a[i] * 2;
        }
        return a;
    }

    public static void main(String[] args) {
//        int a = 1, b = 2;
//        Basics.condition(a, b);
//
        Basics basics = new Basics();
//        basics.doWhileCycle();

        int array[] = new int[3];
        for (int i = 0; i < 3; i++) {
            array[i] = i;
        }

        int result[] = basics.array(array);

//        for (int i = 0; i < result.length; i++){
        for (int num : result) {
            System.out.println(num);
        }
    }
}
