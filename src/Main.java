public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKg = 98;
        double heightM = 1.87;
        int bmiIndex = service.calculate(weightKg, heightM);
        System.out.println(bmiIndex);
    }
}