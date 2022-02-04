public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int creditSumm = 1_000_000;
        double percent = 9.9;
        int numberOfMonths = 36;
        double cps = service.calculate(creditSumm, percent, numberOfMonths);
        System.out.println("Ежемесячный платеж составит - " + Math.round(cps + 41.5) + "рубля(ей)");

        // 41.5 рубль оседает на чьем то счету. И так с каждого платежа, каждого клиента! Дело раскрыто =)git
    }
}

// умное решение https://github.com/rinat-enikeev/Credit-Calculator/blob/master/model/src/main/java/su/ugatu/moodle/is/credit_calc/FinUtil.javahttps://github.com/rinat-enikeev/Cre...c/FinUtil.java

