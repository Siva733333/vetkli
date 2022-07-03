package src;

import java.time.Instant;
import java.util.UUID;

public class Animal {

    private final UUID id;

    private final String name;

    private final Instant creationDate;


    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Instant getCreationDate() {
        return creationDate;
    }

    public Animal(String name) {
        this.name = name;

        id = UUID.randomUUID();
        creationDate = Instant.now();
    }
}
