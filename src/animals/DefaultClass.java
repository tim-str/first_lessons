package animals;

public class DefaultClass extends Animal {
    public DefaultClass(String name) {
        super(name);
    }

    public void tst(){
        System.out.println(this.name);
    }

}
