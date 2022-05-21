public class Main {

    public static void main(String[] args) {

        BmiService service = new BmiService();

        double weight = 76;

        double heigt = 1.82;

        double bmi = service.calculate (weight, heigt);

        System.out.printf("%nИндекс массы тела: %.2f", bmi);

    }
}
