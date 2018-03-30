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

    public void catVoid(){
        System.out.println("catVoid");
    }


    public static void main(String[] args){
        Cat cat = new Cat("Cat");
        cat.say();
        Dog dog = new Dog("Rich");
        dog.say();
        dog.liveWithPeople();

        // полиморфизм наследования
        Animal animal1 = new Cat("animal - cat");
        animal1.say();

        Animal animal2 = new Dog("animal - dog");
        animal2.say();
//        animal2.liveWithPeople();
//        animal2.catVoid();
    }
}
