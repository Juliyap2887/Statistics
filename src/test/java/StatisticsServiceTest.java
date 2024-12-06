import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatisticsService;

public class StatisticsServiceTest {

    @Test
    void shouldCalculateTotalSumSales() {
        StatisticsService service = new StatisticsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 21, 7, 14, 14, 18};
        long expectedSum = 181;
        long actualSum = service.calcSumSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void shouldCalculateAverageSumSales() {
        StatisticsService service = new StatisticsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 21, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.findAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalcMonthMaxSales() {
        StatisticsService service = new StatisticsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 21, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.findMaxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalcMonthMinSales() {
        StatisticsService service = new StatisticsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 21, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.findMinSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalcMonthsBelowAverage() {
        StatisticsService service = new StatisticsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 21, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.countMonthsBelowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalcMonthsAboveAverage() {
        StatisticsService service = new StatisticsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 21, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.countMonthAboveAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}


