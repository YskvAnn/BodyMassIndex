public class Main {
    public static void main(String[] args) {
        BodyMassService service = new BodyMassService();
        int mass = 50;
        double height = 1.55;
        double index = service.calculate(mass, height);
        System.out.println(index);

    }
}