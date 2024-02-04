public class Airplane implements Flyable {
    @Override
    public double fly() {
        return 800.0;
    }

    @Override
    public String getName() {
        return "Самолет";
    }
}