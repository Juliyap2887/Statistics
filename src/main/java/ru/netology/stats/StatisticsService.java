package ru.netology.stats;

import java.util.Arrays;

public class StatisticsService {

    public int calcSumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int findAverage(int[] sales) {

        return calcSumSales(sales) / sales.length;
    }

    public int findMaxSales(int[] sales) {
        int maxMonth = sales[0];
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int findMinSales(int[] sales) {
        int minMonth = sales[0];
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int countMonthsBelowAverage(int[] sales) {
        int totalSales = Arrays.stream(sales).sum();
        int averageSales = totalSales / sales.length;
        int count = 0;
        for (int sale : sales) {
            if (sale < averageSales) {
                count++;
            }
        }
        return count;
    }

    public int countMonthAboveAverage(int[] sales) {
        int totalSales = Arrays.stream(sales).sum();
        int averageSales = totalSales / sales.length;
        int count = 0;
        for (int sale : sales) {
            if (sale > averageSales) {
                count++;
            }
        }
        return count;
    }
}
