public class CreditPaymentService {


    public static double calculate(int creditSumm, double percent, int numberOfMonths) {
        double i = percent / 100 / 12;
        double res = Math.pow(1 + i, numberOfMonths);


        return creditSumm * (i + (i / (res - 1)));
    }
}
