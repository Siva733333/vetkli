package src.repository;

import src.Animal;

import java.util.Set;

public interface AnimalRepository {

    Animal save(Animal animal);

    Set<Animal> getAllAnimals();

    void remove(String animal);
}
