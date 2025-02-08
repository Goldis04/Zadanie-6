package ru.netology.javaqa.zadanie6.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatsServiceTest {

    @Test
    void testCalculateTotalSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateTotalSales(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void testСalсulateAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.calculateAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testFindPeakSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 12;
        int actual = service.calculateBelowAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testFindMinSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 0;
        int actual = service.calculateLiveAboveAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCountMonthsBelowAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.calculateMinSales(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void testCountMonthsAboveAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 1};
        int expected = 8;
        int actual = service.calculateMaxSales(sales);

        Assertions.assertEquals(expected, actual);

    }
}
