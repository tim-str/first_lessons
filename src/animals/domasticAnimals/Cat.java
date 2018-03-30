package animals.domasticAnimals;

import animals.Animal;

public class Cat extends DomasticAnimal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void say(){
//        super.say(); // вызов родительского метода
        System.out.println("Мяу - мяу");
    }

    // перегруз методов - на разные типы аргументов
    // вызываются разные методы, но с одинаковым названием
    public void say(String text){
        System.out.println("cat say" + text);
    }

    public void catVoid(){
        System.out.println("catVoid");
    }

    public static void staticVoid(){
        System.out.println("staticVoid");
//        this.say(); нельзя использовать с методах static
//        super.say(); нельзя использовать с методах static

    }


    public static void main(String[] args){
        Cat cat = new Cat("Cat");
        cat.say();
        cat.say("мяууу");
        cat.protectedVoid();
        Dog dog = new Dog("Rich");
        dog.say();
        dog.liveWithPeople();

        Cat.staticVoid();

        // полиморфизм наследования
        Animal animal1 = new Cat("animal - cat");
        animal1.say();

        Animal animal2 = new Dog("animal - dog");
        animal2.say();
//        animal2.liveWithPeople();
//        animal2.catVoid();
    }
}
