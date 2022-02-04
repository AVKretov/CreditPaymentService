public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int creditSumm = 1_000_000;
        double percent = 9.9;
        int numberOfMonths = 12;
        double cps = service.calculate(creditSumm, percent, numberOfMonths);
        System.out.println("При сумме кредита 1000000 рублей, под 9,9 % годовых, сроком на " + numberOfMonths +
                " месяцев ,ежемесячный платеж составит - " + Math.round(cps + 41.5) + "рубля(ей)");
        int numberOfMonths2 = 24;
        double cps2 = service.calculate(creditSumm, percent, numberOfMonths2);
        System.out.println("При сумме кредита 1000000 рублей, под 9,9 % годовых, сроком на " + numberOfMonths2 +
                " месяцев ,ежемесячный платеж составит - " + Math.round(cps2 + 41.5) + "рубля(ей)");
        int numberOfMonths3 = 36;
        double cps3 = service.calculate(creditSumm, percent, numberOfMonths3);
        System.out.println("При сумме кредита 1000000 рублей, под 9,9 % годовых, сроком на " + numberOfMonths3 +
                " месяцев ,ежемесячный платеж составит - " + Math.round(cps3 + 41.5) + "рубля(ей)");

        // 41.5 рубль оседает на чьем то счету. И так с каждого платежа, каждого клиента! Дело раскрыто =)
    }
}

// умное решение https://github.com/rinat-enikeev/Credit-Calculator/blob/master/model/src/main/java/su/ugatu/moodle/is/credit_calc/FinUtil.javahttps://github.com/rinat-enikeev/Cre...c/FinUtil.java

