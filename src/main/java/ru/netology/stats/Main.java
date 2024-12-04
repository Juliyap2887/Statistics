package ru.netology.stats;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        StatisticsService service = new StatisticsService();
        int[] arr = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int sum = service.calcSumSales(arr);
        int sumAverage = service.findAverage(arr);
        int maxMonth = service.findMaxSales(arr);
        int minMonth = service.findMinSales(arr);
        int countMin = service.countMonthsBelowAverage(arr);
        int countMax = service.countMonthAboveAverage(arr);

        System.out.println(sum);
        System.out.println(sumAverage);
        System.out.println(maxMonth);
        System.out.println(minMonth);
        System.out.println(countMin);
        System.out.println(countMax);
    }

}
