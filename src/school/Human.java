package school;

//public interface Human {
//    void setName(String name);
//    String getName();
//
//    default boolean isHuman(){
//        return true;
//    }
//    // методы - public
//    // нельзя создать экземпляр интерфейса
//}
//
//
//
//class Man implements Human {
//
//    @Override
//    public void setName(String name) {
//
//    }
//
//    @Override
//    public String getName() {
//        return null;
//    }
//
//    public void createMan(){
//        Man man = new Man();
//        man.isHuman();
//    }
//}
//
//
//interface Teacher {
//    void teach(Pupil pupil);
//}
//
//interface Pupil {
//    void study();
//}
//
////class FirstYearPupil implements Human, Pupil {
////  класс, который реализует интерфейс
//// должен реализовать все его методы
//
////    класс может реализовывать более одно интерфейса
//
////}
//
//
//interface Animal{
//    public String getName();
//}
//
//// Абстрактные классы
//
//abstract class DomasticAnimal implements Animal {
//    abstract void eat();
//}
//
////class Dog extends DomasticAnimal{
////
////    @Override
////    public String getName() {
////        return null;
////    }
////
//////    public void littleDog(){
//////        Dog dog = new Dog();
//////        dog.eat();
//////    }
////}
//
//
//
//class Cat extends DomasticAnimal{
//
//
//    @Override
//    public String getName() {
//        return null;
//    }
//
//    @Override
//    void eat() {
//
//    }
//}
//


import javax.annotation.PostConstruct;

interface Human{
    String getName();
}

interface Teacher extends Human{
    void teach(Student student);
}

interface Student extends Human{

}

interface Worker extends Human{
    void work();
}


class Ivan implements Teacher, Worker{

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void work(){
        System.out.println("Ivan is working");
    }

    @Override
    public void teach(Student student){
        System.out.println("Teaching " + student.getName());

    }
}

class Vasya implements Student, Worker{

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void work() {

    }

    public void createObj(){
        Ivan ivan = new Ivan();
        Vasya vasya = new Vasya();

        Human human1 = ivan;
        Human human2 = vasya;

        System.out.println(human1.getName());
        System.out.println(human2.getName());

        Teacher teacher1 = new Ivan();
        Student student = new Vasya();

        Worker worker1 = new Ivan();
        Worker worker2 = new Vasya();
        worker2.work();
    }
}



















