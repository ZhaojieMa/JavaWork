package SecondAssessment;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        MyAnimalShop a = new MyAnimalShop();
        Scanner sc = new Scanner(System.in);
        a.balance = sc.nextDouble();
        while (sc.hasNextLine()) {
            Cats c2 = new Cats();
            c2.name = sc.nextLine();
            c2.gender = sc.nextLine();
            c2.price = sc.nextDouble();
            c2.age = sc.nextInt();
            a.AnimalList.add(c2);
        }
        a.buy(sc.nextLine(), sc.nextInt(), sc.nextLine(), sc.nextDouble());
        a.TreatCustomers(sc.nextLine(), sc.nextInt());
        a.closure();
    }
}
