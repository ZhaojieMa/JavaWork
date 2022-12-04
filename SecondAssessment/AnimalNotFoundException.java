package SecondAssessment;

public class AnimalNotFoundException extends RuntimeException {
    private final int detail;

    public AnimalNotFoundException(int a) {
        this.detail = a;
    }

    @Override
    public String toString() {
        return "AnimalNotFoundException{" +
                "detail=" + detail +
                '}';
    }
}
