package src.repository.impl;

import src.Animal;
import src.Doctor;
import src.repository.DoctorRepository;

import java.util.HashSet;
import java.util.Set;

public class DoctorRepositoryImpl implements DoctorRepository {

    private static final Set<Doctor> DOCTORS = new HashSet<>();

    @Override
    public Doctor save(Doctor doctor) {
        DOCTORS.add(doctor);

        return doctor;
    }

    @Override
    public Set<Doctor> getAllDoctor() {
        return DOCTORS;
    }
}
