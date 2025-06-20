public class ForecastTest {
    public static void main(String[] args) {
        ForecastCalculator calculator = new ForecastCalculator();

        int years = 5;
        double presentValue = 10000;
        double rate = 0.10;

        double futureValue = calculator.calculateFutureValue(years, presentValue, rate);

        System.out.printf("Future value after %d years: %.2f", years, futureValue);
    }
}
