public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bmi = service.calculate(69, 1.75);
        System.out.println(bmi);

    }
}
