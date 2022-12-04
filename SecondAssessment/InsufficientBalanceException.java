package SecondAssessment;

public class InsufficientBalanceException extends RuntimeException {
    private final double detail;

    public InsufficientBalanceException(double balance) {
        this.detail = balance;
    }

    @Override
    public String toString() {
        return "InsufficientBalanceException{" +
                "detail=" + detail +
                '}';
    }
}
