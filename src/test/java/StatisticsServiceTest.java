import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatisticsService;

public class StatisticsServiceTest {

    @Test
    void shouldCalculateTotalSumSales() {
        StatisticsService service = new StatisticsService();

        int sales[] = {8, 15, 13, 15, 17, 20, 19, 21, 7, 14, 14, 18};
        int expectedSum = 181;
        int actualSum = service.calcSumSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void shouldCalculateAverageSumSales() {
        StatisticsService service = new StatisticsService();

        int sales[] = {8, 15, 13, 15, 17, 20, 19, 21, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.findAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalcMonthMaxSales() {
        StatisticsService service = new StatisticsService();

        int sales[] = {8, 15, 13, 15, 17, 20, 19, 21, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.findMaxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalcMonthMinSales() {
        StatisticsService service = new StatisticsService();

        int sales[] = {8, 15, 13, 15, 17, 20, 19, 21, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.findMinSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalcMonthsBelowAverage() {
        StatisticsService service = new StatisticsService();

        int sales[] = {8, 15, 13, 15, 17, 20, 19, 21, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.countMonthsBelowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalcMonthsAboveAverage() {
        StatisticsService service = new StatisticsService();

        int sales[] = {8, 15, 13, 15, 17, 20, 19, 21, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.countMonthAboveAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}


