public class BmiService {
    public int calculate(double weight, double height) {
        int result = (int) (weight / Math.pow(height, 2));
        return result;
    }
}
