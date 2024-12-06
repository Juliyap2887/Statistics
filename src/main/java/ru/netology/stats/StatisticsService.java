package ru.netology.stats;

public class StatisticsService {

    public long calcSumSales(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    public long findAverage(long[] sales) {

        return calcSumSales(sales) / sales.length;
    }

    public int findMaxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int findMinSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int countMonthsBelowAverage(long[] sales) {

        long averageSales = findAverage(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales) {
                count++;
            }
        }
        return count;
    }

    public int countMonthAboveAverage(long[] sales) {

        long averageSales = findAverage(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales) {
                count++;
            }
        }
        return count;
    }
}
