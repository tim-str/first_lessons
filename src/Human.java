public class Human {

    // свойства, если значения не заданы, то при создании объекта, задаются значения по - умолчанию:
    // boolean - false, числа - 0, ссылочные типы - null
    boolean walking;
    String name;
    int age;
    Animal animal;

// конструктор - вызывается при создании нового объекта
//    Конструктор инициализирует объект непосредственно во время создания.
//    Имя конструктора совпадает с именем класса, включая регистр
//    Класс может иметь несколько конструкторов
//    Если в классе не описан конструктор, компилятор автоматически добавляет в код конструктор без параметров
    public Human(String name, int age) {
        this.name = name;  // можно установить значения свойств для объекта в момент создания этого объекта
        this.age = age;
        walking = false;
    }


    // this - ссылка ОБЪЕКТА на себя, на текущий ОБЪЕКТ

    // создание методов:
//    void означает, что метод не имеет возвращаемого значения.
//    Если метод возвратил int, то пишите int вместо void,
//    если возвратил String, то пишите String вместо void и тд

    public void walk() {
        if (!walking) {
            System.out.println("Walking...");
            walking = true;
        } else {
            System.out.println("Already Walking...");
        }

    }

    public void stop(){
        if (walking) {
            System.out.println("Stop...");
            walking = false;
        } else {
            System.out.println("Already Stop...");
        }

    }

    public String getName(){

        return this.name;
    }

//    public int getAge(){
//        return age;
//    }

    public void addPet(Animal animal){
        this.animal = animal;
    }

    public static void main(String [] args) {
        Human ivan = new Human("Ivan", 23);  // создаем новый объект, экземпляр класса Human
//        ivan.setName("Ivan");
        ivan.walk();
        ivan.walk();
        Animal cat = new Animal("Имя кошки", "gray"); // создаем новый объект, экземпляр класса Animal
        ivan.addPet(cat);

        System.out.println(ivan.animal.name);

        Human masha = new Human("Masha", 23); // создаем еще один новый объект, экземпляр класса Human
//        masha.setName("Masha");
        masha.walk();


        System.out.println(masha.getName());

//        Human human2 = new Human();
//        Human human3 = human2;
    }
}


class Animal{
    String name;
    String color;
    int age;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }
}
