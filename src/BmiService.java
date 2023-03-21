public class BmiService {
    public int calculate(int weightKg, double heightM) {
        int bmiIndex = (int) (weightKg / (heightM * heightM));
        return bmiIndex;
    }
}
