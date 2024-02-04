class Bird implements Flyable {
    @Override
    public double fly() {
        return 20.0;
    }

    @Override
    public String getName() {
        return "Птица";
    }
}
