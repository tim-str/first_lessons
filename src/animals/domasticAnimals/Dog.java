package animals.domasticAnimals;

public class Dog extends DomasticAnimal {
    public Dog(String name) {
        super(name);
    }

    // переопределение метода родительского класса
    @Override
    public void say(){
//        super.say(); // вызов родительского метода
        System.out.println("Гав - гав");
    }


}
