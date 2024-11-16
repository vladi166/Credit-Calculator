public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int one_year_payment = service.calculate(1000000, 12, 9.99);
        System.out.println(one_year_payment);
        int two_years_payment = service.calculate(1000000, 24, 9.99);
        System.out.println(two_years_payment);
        int three_years_payment = service.calculate(1000000, 36, 9.99);
        System.out.println(three_years_payment);
    }
}