package ru.netology.stats;

public class StatsService {

    public long sumOfSales(long[] sales) { // сумма всех продаж
        long sum = 0;
        //for (int i = 0; i < sales.length; i++) {
        //     sum = int sum + int sales[i];
        for (long t : sales) {
            sum = sum + t;
        }
        return sum;
    }

    public long mediumSale(long[] sales) {
        long sum = sumOfSales(sales);
        long medium = sum / sales.length;
        return medium;
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int amountOfMonthsSalesBelowMedium(long[] sales) {
        long medium = mediumSale(sales);
        int monthsBelowMedium = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < medium) {
                monthsBelowMedium++;
            }

        }
        return monthsBelowMedium;

    }

    public int amountOfMonthsSalesAboveMedium(long[] sales) {
        long medium = mediumSale(sales);
        int monthsAboveMedium = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > medium) {
                monthsAboveMedium++;
            }

        }
        return monthsAboveMedium;

    }
}
