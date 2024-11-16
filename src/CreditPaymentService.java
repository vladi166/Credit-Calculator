public class CreditPaymentService {
    public int calculate(int loanAmount, int loanTerm, double percent) {
        double monthly_interest_rate = percent / 100 / 12;
        int mounthlyPayment = (int) (loanAmount * monthly_interest_rate * Math.pow(monthly_interest_rate + 1, loanTerm) / (Math.pow(monthly_interest_rate + 1, loanTerm) - 1));
        return mounthlyPayment;
    }
}
