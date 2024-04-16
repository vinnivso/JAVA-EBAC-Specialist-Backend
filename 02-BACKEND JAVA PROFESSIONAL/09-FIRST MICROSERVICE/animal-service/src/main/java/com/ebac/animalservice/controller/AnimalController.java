package com.ebac.animalservice.controller;

import com.ebac.animalservice.entity.Animal;
import com.ebac.animalservice.repository.AnimalRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController {
    private AnimalRepository repository;

    public AnimalController(AnimalRepository repository) {
        this.repository = repository;
    }

    /**
     * Retrieves a list of all animals from the repository.
     *
     * @return A list of Animal objects.
     */
    @GetMapping
    private List<Animal> findAll() {
        // Retrieve all animals from the repository
        return repository.findAll();
    }

    /**
     * Retrieves a list of animals that have not been adopted.
     *
     * @return a list of animals that have not been adopted.
     */
    @GetMapping("/not-adopted")
    private List<Animal> findNotAdopted() {
        return repository.findNotAdopted();
    }

    /**
     * Retrieves a list of adopted animals from the repository.
     *
     * @return List of adopted animals
     */
    @GetMapping("/adopted")
    private List<Animal> findAdopted() {
        return repository.findAdopted();
    }

    /**
     * Creates a new animal in the database.
     *
     * @param animal The animal object to be created
     * @return The created animal object
     */
    @PostMapping
    private Animal create(@RequestBody Animal animal) {
        return repository.save(animal);
    }
}
