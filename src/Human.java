public class Human {

    boolean walking;
    String name;
    int age;
    Animal animal;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }



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
        Human ivan = new Human("Ivan", 23);
//        ivan.setName("Ivan");
        ivan.walk();
        ivan.walk();
        Animal cat = new Animal("Имя кошки", "gray");
        ivan.addPet(cat);

        System.out.println(ivan.animal.name);

        Human masha = new Human("Masha", 23);
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
