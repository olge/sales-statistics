package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {

    @Test
    public void findSumSales() {
        StatsService service = new StatsService();
        long[] sales = {10000, 20500, 47800, 56000};
        long expectedSum = 134300;
        long actualSum = service.sumOfSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void findMediumSale() {
        StatsService service = new StatsService();
        long[] sales = {10000, 20000, 47500, 56000};
        long expectedMediumSum = 33375;
        long actualMediumSum = service.mediumSale(sales);

        Assertions.assertEquals(expectedMediumSum, actualMediumSum);
    }

    @Test
    public void findMonthOfMinSales() {
        StatsService service = new StatsService();
        long[] sales = {10000, 20000, 47500, 56000};
        int expectedMonth = 1;
        int actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }


    @Test
    public void findMonthOfMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {10000, 20000, 47500, 56000};
        int expectedMonth = 4;
        int actualMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void findAmountOfMonthsSalesBelowMedium() {
        StatsService service = new StatsService();
        long[] sales = {10000, 20000, 47500, 56000, 23000};
        int expectedAmountOfMonth = 3;
        int actualAmountOfMonth = service.amountOfMonthsSalesBelowMedium(sales);

        Assertions.assertEquals(expectedAmountOfMonth, actualAmountOfMonth);
    }

    @Test
    public void findAmountOfMonthsSalesAboveMedium() {
        StatsService service = new StatsService();
        long[] sales = {10000, 20000, 47500, 56000, 17000};
        int expectedAmountOfMonth = 2;
        int actualAmountOfMonth = service.amountOfMonthsSalesAboveMedium(sales);

        Assertions.assertEquals(expectedAmountOfMonth, actualAmountOfMonth);
    }

}
