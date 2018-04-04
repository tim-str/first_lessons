package lesson7;

public class StaticLesson {
    public static void main(String[] args){
//        доступ  к статическим переменным: имя_класса.имя_переменной
        System.out.println(StaticExample.staticVar);
        StaticExample staticExample = new StaticExample();
        StaticExample staticExample2 = new StaticExample();
        StaticExample staticExample3 = new StaticExample();

        System.out.println(staticExample.getNotStaticVar());
        System.out.println(staticExample.getStaticVar());

        System.out.println(staticExample2.getNotStaticVar());
        System.out.println(staticExample2.getStaticVar());

        System.out.println(staticExample3.getNotStaticVar());
        System.out.println(staticExample3.getStaticVar());

//        доступ  к статическим методам: имя_класса.имя_метода
        StaticExample.StaticVoid();
//        обращение к статическому методу интерфейса
        StaticInterface.staticVoid1();
//        StaticExample.staticVoid1();
    }
}

class StaticExample implements StaticInterface{
//    статическими могут быть
//    переменные
//    методы
//    вложенные классы

    // создание статической переменной
    static int staticVar = 0;
    int notStaticVar = 0;

    public StaticExample(){
        staticVar++;
        notStaticVar++;
    }

    public int getStaticVar(){
        return staticVar;
    }
//
    public int getNotStaticVar(){
        return notStaticVar;
    }

//    статические методы
    static void StaticVoid(){
        System.out.println(staticVar);
//        System.out.println(this.notStaticVar); - ошибка

//        могут вызывать только другие статические методы
//        могут работать со статическими переменными
//        в них нельзя обращаться к this и super
    }
//    статические методы интерфейса нельзя переопределить
//    @Override
//    только создать новый
//    static void staticVoid1(){
//        System.out.println("staticVoid StaticExample");
//    }
}
//JAVA 8

interface StaticInterface{
//    статические методы интерфейса нельзя переопределить
//    доступны внутри интерфейса
//    могут использоваться через интерфейс: имя_интерфейса.имя_метода
    static void staticVoid1(){
        System.out.println("staticVoid Interface");
    }
}
