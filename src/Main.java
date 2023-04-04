public class Main {
    public static void main(String[] args) {
       bodyMassService service = new bodyMassService();
       int m = 50;
       double h = 1.55;
       double index = service.calculate (m,h);
        System.out.println(index);

    }
}