public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Доктор Иванов", "Кардиолог");
        doctor.displayInfo();

        System.out.println();

        Nurse nurse = new Nurse("Медсестра Иванова", 5);
        nurse.displayInfo();
    }
}