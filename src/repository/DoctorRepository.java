package src.repository;

import src.Animal;
import src.Doctor;

import java.util.Set;

public interface DoctorRepository {

    Doctor save(Doctor doctor);

    Set<Doctor> getAllDoctor();
}
