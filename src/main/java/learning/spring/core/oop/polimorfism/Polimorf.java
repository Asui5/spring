package learning.spring.core.oop.polimorfism;

//override - перевизначення
//overload - перегрузка методів різними параметрами
public class Polimorf {

    private void add(int a, int b){
        System.out.println(a+b+" - int");
    }

    private void add(double a, double b){
        System.out.println(a+b+" - double");
    }

    public static void main(String[] args) {
        Polimorf polimorf = new Polimorf();
        polimorf.add(3,3);
        polimorf.add(3.23,3.52);
    }
}
