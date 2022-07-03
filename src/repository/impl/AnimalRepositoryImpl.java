package src.repository.impl;

import src.Animal;
import src.repository.AnimalRepository;

import java.util.HashSet;
import java.util.Set;

public class AnimalRepositoryImpl implements AnimalRepository {
    private static final Set<Animal> ANIMALS = new HashSet<>();

    public Animal save(Animal animal) {
        ANIMALS.add(animal);

        return animal;
    }


    public Set<Animal> getAllAnimals() {

        return ANIMALS;
    }


    public void remove(String animal) {
        ANIMALS.remove(animal);
    }
}
