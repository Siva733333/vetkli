package src;

import java.time.Instant;
import java.util.UUID;

public class Doctor {

    private final String name;

    private final String surname;

    private final String experience;



    public Doctor(String name, String surname, String experience) {
        this.name = name;
        this.surname = surname;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getExperience() {
        return experience;
    }
}
