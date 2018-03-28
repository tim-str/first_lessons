public class Human {

    boolean walking;
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }



    public void walk() {

        System.out.println("Walking...");
    }

    public void stop(){
        System.out.println("Stop...");
    }

    public String getName(){
        return this.name;
    }

//    public int getAge(){
//        return age;
//    }

    public static void main(String [] args) {
        Human ivan = new Human("Ivan", 23);
//        ivan.setName("Ivan");
        ivan.walk();

        System.out.println(ivan.getName());

        Human masha = new Human("Masha", 23);
//        masha.setName("Masha");
        masha.walk();


        System.out.println(masha.getName());




//        Human human2 = new Human();
//        Human human3 = human2;
    }
}
