package animals.domasticAnimals;

import animals.Animal; // импорт класса
//import animals.*; импорт пакета целиком

public class DomasticAnimal extends Animal { // наследование
    public DomasticAnimal(String name){
        super(name);
    }

    public void liveWithPeople(){
        System.out.println("I am live with people");
    }

//    public static void main(String[] args){
//        DomasticAnimal da = new DomasticAnimal("DomAnimal");
//        da.say();
//        da.liveWithPeople();
//
//    }
}
