// Класс Nurse
public class Nurse {
    private String name;
    private int experienceYears;
    private boolean isHelpingInOperation;
    private boolean isResting;
    private boolean isTakingCare;

    public Nurse(String name, int experienceYears) {
        this.name = name;
        this.experienceYears = experienceYears;
        // Изначально устанавливаем все состояния в false
        this.isHelpingInOperation = false;
        this.isResting = false;
        this.isTakingCare = false;
    }

    public void displayInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Опыт работы: " + experienceYears);
        System.out.println("Ассистирует на операции: " + isHelpingInOperation);
        System.out.println("Отдыхает: " + isResting);
        System.out.println("Заботится о пациентах: " + isTakingCare);
    }

    public void startHelpingInOperation() {
        isHelpingInOperation = true;
        isResting = false;
        isTakingCare = false;
    }

    public void startRest() {
        isHelpingInOperation = false;
        isResting = true;
        isTakingCare = false;
    }

    public void startTakingCare() {
        isHelpingInOperation = false;
        isResting = false;
        isTakingCare = true;
    }

}
