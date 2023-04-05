public class Main {
    public static void main(String[] args) {
       BodyMassService service = new BodyMassService();
       int m = 50;
       double h = 1.55;
       double index = service.calculate (m,h);
        System.out.println(index);

    }
}