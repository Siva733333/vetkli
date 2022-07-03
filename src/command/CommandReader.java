package src.command;

import src.Animal;
import src.Doctor;
import src.repository.AnimalRepository;
import src.repository.DoctorRepository;
import src.repository.impl.AnimalRepositoryImpl;
import src.repository.impl.DoctorRepositoryImpl;

import java.util.Scanner;

public class CommandReader {


    private static final AnimalRepository animalRepository = new AnimalRepositoryImpl();

    private static final DoctorRepository doctorRepository = new DoctorRepositoryImpl();

    public static int startReadCommand(){
        System.out.println("Programm started!");
        Scanner s = new Scanner(System.in);
        while(true){
            var text = s.nextLine();
            int code = CommandReader.readCommand(text);

            if (code==0){
                break;
            }
        }
        return 0;
    }


    /**
     * create animal, doctor - создает запись доктора/пациента;
     * animals, doctors - выводит все записи доктор/пациент;
     * remove animal - удаляет запись животного(пациента).
     */

    public static int readCommand(String command){
        if(command.contains("exit")) {
            return 0;
        }
        if(command.contains("create animal")) {
            return createAnimal(command);
        }
        if(command.contains("animals")) {
            return animals(command);
        }
        if(command.contains("create doctor")) {
            return createDoctor(command);
        }
        if(command.contains("doctors")) {
            return doctors(command);
        }
        if(command.contains("remove animal")) {
            return removeAnimal(command);
        }
        return -1;
    }

    private static int createAnimal(String command) {
        String[] words = command.split(" ");

        String animalName = words[2];

        Animal newAnimal = new Animal(animalName);
        animalRepository.save(newAnimal);

        System.out.println("Animal created!");

        return 1;
    }

    private static int animals(String command) {
        var animals = animalRepository.getAllAnimals();

        for (var animal : animals){
            System.out.printf("Id: %s, Name: %s, Date: %s /n",
                    animal.getId(), animal.getName(), animal.getCreationDate());
        }
        return 1;
    }

    private static int createDoctor(String command) {
        String[] words = command.split(" ");

        String doctorName = words[2];
        String doctorSurname = words[3];
        String doctorExperience = words[4];


        Doctor newDoctor = new Doctor(doctorName, doctorSurname,doctorExperience);
        doctorRepository.save(newDoctor);

        System.out.println("Doctor created!");

        return 1;
    }

    private static int doctors(String command) {
        var doctors = doctorRepository.getAllDoctor();

        for (var doctor : doctors){
            System.out.printf("Name: %s, Surname: %s, Experience: %s /r",
                    doctor.getName(), doctor.getSurname(),doctor.getExperience() );
        }
        return 1;
    }

    private static int removeAnimal(String command) {
        System.out.println("I work");
        var wordsArray = command.split(" ");

        var animalNameToRemove = wordsArray[2];


        animalRepository.remove(animalNameToRemove);

        return 1;
    }
}