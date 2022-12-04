package SecondAssessment;


import java.time.LocalDateTime;

public class Customer {
    private String name;
    private int count;
    LocalDateTime localDateTime = LocalDateTime.now();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", count=" + count +
                ", localDateTime=" + localDateTime +
                '}';
    }
}
