class Fish implements Swimable {
    @Override
    public double swim() {
        return 5.0;
    }

    @Override
    public String getName() {
        return "Рыба";
    }
}
