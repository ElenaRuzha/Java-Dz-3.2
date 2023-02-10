public class BmiService {
    public int calculate(int weightKg, double heightMeter) {
        double index = weightKg / (heightMeter * heightMeter);
        int result = (int) index;
        return result;
    }
}
