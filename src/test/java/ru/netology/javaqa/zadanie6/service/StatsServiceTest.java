package ru.netology.javaqa.zadanie6.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatsServiceTest {

    @Test
    void testCalculateTotalSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        long actual = service.calculateTotalSales(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void testCalculateAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        long actual = service.calculateAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCountMonthsAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 1};
        long actual = service.calculateMaxSales(sales);
        long expected = 8;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void testFindMinSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 0;
        long actual = service.calculateLiveAboveAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testFindPeakSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.calculateBelowAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    void testCountMonthsBelowAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        long actual = service.calculateMinSales(sales);

        Assertions.assertEquals(expected, actual);
    }
}

