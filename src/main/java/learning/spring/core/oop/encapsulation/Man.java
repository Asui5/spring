package learning.spring.core.oop.encapsulation;

// private:доступ тільки з цього класу,
// (default):private + цей пакет(папка),
// protected:default + класи,що наслідуються,
// public: доступно звідусіль
public class Man {
    // Стан
    private String firstname;
    private String lastname;

    // Поведінка

    Man() {
        this.firstname = "Tolik";
    }

    Man(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname(){
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public static void main(String[] args) {
        Man man = new Man();
        man.setFirstname("Ihor");
        System.out.println(man.getFirstname());
    }
}
