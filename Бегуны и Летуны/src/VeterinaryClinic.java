import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    private final List<Goable> goableAnimals = new ArrayList<>();
    private final List<Flyable> flyableAnimals = new ArrayList<>();
    private final List<Swimable> swimableAnimals = new ArrayList<>();
    private final List<StaffMember> staffMembers = new ArrayList<>();

    public void addGoableAnimal(Goable animal) {
        goableAnimals.add(animal);
    }

    public void addFlyableAnimal(Flyable animal) {
        flyableAnimals.add(animal);
    }

    public void addSwimableAnimal(Swimable animal) {
        swimableAnimals.add(animal);
    }

    public void addStaffMember(StaffMember staffMember) {
        staffMembers.add(staffMember);
    }

    public List<Goable> getGoableAnimals() {
        return goableAnimals;
    }

    public List<Flyable> getFlyableAnimals() {
        return flyableAnimals;
    }

    public List<Swimable> getSwimableAnimals() {
        return swimableAnimals;
    }

    public List<StaffMember> getStaffMembers() {
        return staffMembers;
    }

    public List<Goable> getAllRunners() {
        List<Goable> runners = new ArrayList<>();
        for (Goable animal : goableAnimals) {
            if (animal instanceof Runner) {
                runners.add(animal);
            }
        }
        return runners;
    }

    public List<Swimable> getAllSwimmers() {
        List<Swimable> swimmers = new ArrayList<>();
        for (Swimable animal : swimableAnimals) {
            swimmers.add(animal);
        }
        return swimmers;
    }

    public List<Flyable> getAllFlyers() {
        List<Flyable> flyers = new ArrayList<>();
        for (Flyable animal : flyableAnimals) {
            flyers.add(animal);
        }
        return flyers;
    }
}
