public class BodyMassService {
    public double calculate(int mass, double height) {
        double index = mass / (height * height);
        return index;

    }
}
