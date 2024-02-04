public class Car implements Goable, Nameable {
    @Override
    public double run() {
        return 60.0;
    }

    @Override
    public String getName() {
        return "Автомобиль";
    }
}