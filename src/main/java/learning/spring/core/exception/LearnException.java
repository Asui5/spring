package learning.spring.core.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// try{може вилетіти помилка}
// catch(Клас помилки){шо робити, коли виникає}
// finally(){виконається полюбе}
// throw new НазваПомилки() викидаєш помилку
// throws НазваПомилки(в методі перекидаєш помилку на рівень вище і можеш зловити там)

public class LearnException {

    public String throwNullPointer() throws MyException {
        String s = null;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            s = reader.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        if (s.equals("")){
            throw new MyException ("String can not be empty!");
        }
        return s;
    }

    public static void main(String[] args) {
        LearnException learnException = new LearnException();
        try{
            learnException.throwNullPointer();
        } catch (MyException e) {
            e.printStackTrace();
    }}
}
