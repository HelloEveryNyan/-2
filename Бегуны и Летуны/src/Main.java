public class Main {
    public static void main(String[] args) {
        VeterinaryClinic vetClinic = new VeterinaryClinic();

        vetClinic.addGoableAnimal(new Runner());
        vetClinic.addGoableAnimal(new Car());

        vetClinic.addFlyableAnimal(new Bird());
        vetClinic.addFlyableAnimal(new Airplane());

        vetClinic.addSwimableAnimal(new Fish());
        vetClinic.addSwimableAnimal(new Dolphin());

        vetClinic.addStaffMember(new StaffMember("Иван Иванов", "Ветеринар"));
        vetClinic.addStaffMember(new StaffMember("Людмила Ивановна", "Медсестра"));

        System.out.println("Скорость передвижения:");
        for (Goable animal : vetClinic.getGoableAnimals()) {
            System.out.printf("%s движение со скоростью %.2f км/ч%n", animal.getName(), animal.run());
        }

        System.out.println("\nСкорость полета:");
        for (Flyable animal : vetClinic.getFlyableAnimals()) {
            System.out.printf("%s летит со скоростью %.2f км/ч%n", animal.getName(), animal.fly());
        }

        System.out.println("\nСкорость плаванья:");
        for (Swimable animal : vetClinic.getSwimableAnimals()) {
            System.out.printf("%s плывет со скоростью %.2f км/ч%n", animal.getName(), animal.swim());
        }

        System.out.println("\nПерсонал клиники:");
        for (StaffMember staffMember : vetClinic.getStaffMembers()) {
            System.out.println("Имя: " + staffMember.getName() + ", Должность: " + staffMember.getPosition());
        }

        System.out.println("\nВсе бегуны:");
        for (Goable runner : vetClinic.getAllRunners()) {
            System.out.println("Скорость: " + runner.run() + " км/ч");
        }

        System.out.println("\nВсе летуны:");
        for (Flyable flyer : vetClinic.getAllFlyers()) {
            System.out.println("Скорость: " + flyer.fly() + " км/ч");
        }

        System.out.println("\nВсе плывуны:");
        for (Swimable swimmer : vetClinic.getAllSwimmers()) {
            System.out.println("Скорость: " + swimmer.swim() + " км/ч");
        }
    }
}
