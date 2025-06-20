public class ForecastCalculator {
  
    public double calculateFutureValue(int years, double presentValue, double rate) {
        if (years == 0) {
            return presentValue;
        }
        return calculateFutureValue(years - 1, presentValue, rate) * (1 + rate);
    }
}
