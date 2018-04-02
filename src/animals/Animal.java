package animals;


public class Animal {
//    модификаторы доступа
//    public  - виден везде
//    protected виден только в рамках пакета, где находится класс
//            и наследникам из любого пакета
//    private - виден только в рамках своего класса

//    default (без модификатора) виден только в рамках своего пакета

    String name;
    public Animal(String name) {
        this.name = name;
    }

    protected void protectedVoid(){
        System.out.println("protectedVoid");
    }

    private void privateVoid(){
        protectedVoid();
        System.out.println("privateVoid");
    }

    public void say(){
        privateVoid();
        System.out.println("I am Animal");

    }

}
