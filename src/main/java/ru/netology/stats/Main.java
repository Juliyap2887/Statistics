package ru.netology.stats;

public class Main {
    public static void main(String[] args) {

        StatisticsService service = new StatisticsService();
        long[] arr = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        long sum = service.calcSumSales(arr);
        long sumAverage = service.findAverage(arr);
        long maxMonth = service.findMaxSales(arr);
        long minMonth = service.findMinSales(arr);
        long countMin = service.countMonthsBelowAverage(arr);
        long countMax = service.countMonthAboveAverage(arr);

        System.out.println(sum);
        System.out.println(sumAverage);
        System.out.println(maxMonth);
        System.out.println(minMonth);
        System.out.println(countMin);
        System.out.println(countMax);
    }

}
