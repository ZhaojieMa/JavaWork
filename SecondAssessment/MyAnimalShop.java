package SecondAssessment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class MyAnimalShop implements AnimalShop {
    double balance;
    Scanner sc = new Scanner(System.in);

    @Override
    public void buy(String name, int age, String gender, double price) throws InsufficientBalanceException {
        balance -= price;
        if (balance < 0) {
            throw new InsufficientBalanceException(balance);
        }
        System.out.println("请输入物种");
        String type = sc.nextLine();
        if (type == "cat") {
            Cats c = new Cats();
            c.name = name;
            c.age = age;
            c.gender = gender;
            c.price = price;
            AnimalList.add(c);
            System.out.println(c);
        } else {
            ChineseRuralDog d = new ChineseRuralDog();
            d.name = name;
            d.age = age;
            d.gender = gender;
            d.price = price;
            AnimalList.add(d);
            System.out.println(d);
        }
    }


    @Override
    public void TreatCustomers(String name, int count) throws AnimalNotFoundException {
        CustomerList.add(name);
        if (AnimalList.size() == 0) {
            throw new AnimalNotFoundException(AnimalList.size());
        }
        System.out.println("请输入购买宠物信息");
        String type = sc.nextLine();
        if (type == "cat") {
            balance += 200;
            Cats c1 = new Cats();
            c1.name = sc.nextLine();
            c1.age = sc.nextInt();
            c1.gender = sc.nextLine();
            c1.price = sc.nextDouble();
            System.out.println(c1);
            if(AnimalList.contains(c1)){
                System.out.println("购买成功");
                AnimalList.remove(c1);
            }else{
                System.out.println("不存在此动物");
            }

        } else {
            balance += 100;
            ChineseRuralDog d1 = new ChineseRuralDog();
            d1.name = sc.nextLine();
            d1.age = sc.nextInt();
            d1.gender = sc.nextLine();
            d1.price = sc.nextDouble();
            System.out.println(d1);
            if(AnimalList.contains(d1)){
                System.out.println("购买成功");
                AnimalList.remove(d1);
            }else{
                System.out.println("不存在此动物");
            }
        }

    }

    @Override
    public void closure() {
        double profit = balance - 500;
        System.out.println("盈利" + profit);
        LocalDate now = LocalDate.now();
        System.out.println(CustomerList);
    }

    ArrayList AnimalList = new ArrayList();
    ArrayList CustomerList = new ArrayList();

}
