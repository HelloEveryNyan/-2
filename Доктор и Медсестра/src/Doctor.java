public class Doctor {
    private String name;
    private String specialization;
    private boolean isInOperation;
    private boolean isResting;
    private boolean isInConsultation;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        this.isInOperation = false;
        this.isResting = false;
        this.isInConsultation = false;
    }
    public Doctor(String name) {
        this(name, "General Practitioner");
    }

    public void displayInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Должность: " + specialization);
        System.out.println("На операции: " + isInOperation);
        System.out.println("Отдыхает: " + isResting);
        System.out.println("Обходит пациентов: " + isInConsultation);
    }

    public void startOperation() {
        isInOperation = true;
        isResting = false;
        isInConsultation = false;
    }

    public void startRest() {
        isInOperation = false;
        isResting = true;
        isInConsultation = false;
    }

    public void startConsultation() {
        isInOperation = false;
        isResting = false;
        isInConsultation = true;
    }

}
