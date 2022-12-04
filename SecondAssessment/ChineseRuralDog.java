package SecondAssessment;

import java.util.Scanner;

public class ChineseRuralDog extends Animal {

    public ChineseRuralDog() {

    }

    @Override
    public String toString() {
        return name+""+age+""+gender+""+price;
    }


    public ChineseRuralDog(String name, int age, String gender, double price) {
        super(name, age, gender, price);
        this.price = 100;
        Scanner scan = new Scanner(System.in);
        boolean isVaccineInjected = scan.nextBoolean();
        if (isVaccineInjected) {
            System.out.println("isVaccineInjected");
        } else {
            System.out.println("isn'tVaccineInjected");
        }
    }

}
