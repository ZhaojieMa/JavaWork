package SecondAssessment;

public class Cats extends Animal {
    public Cats() {

    }

    public Cats(String name, int age, String gender, double price) {
        super(name, age, gender, price);
        this.price = 200;
    }

    @Override
    public String toString() {
        return name+""+age+""+gender+""+price;
    }
}
