package ua.org.oa.lecture4.practice1;

/**
 * Created by dmitr on 19.06.2017.
 */
public class BankUtils{
    public static void calculateCredit(double loanAmount, int period, double rate){

        double monthRate = rate/12;
        double loanBody = Math.round(loanAmount/period*100)/100.;
        double restOfAmount = loanAmount;
        double totalPercent = 0;
        for (int i = 1; i <= period; i++) {
            double percent = restOfAmount * monthRate / 100;
            System.out.println(i + "-th month: body = " + loanBody + " percent = " + percent + " total: " + (loanBody + percent));
            totalPercent += percent;
            restOfAmount -= loanBody;
        }
        System.out.println("totalPercent = " + totalPercent);
        System.out.println("restOfAmount = " + restOfAmount);
    }
}
