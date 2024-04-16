package com.ebac.animalservice.controller;

import com.ebac.animalservice.entity.Animal;
import com.ebac.animalservice.repository.AnimalRepository;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController {
    private final AnimalRepository repository;

    public AnimalController(AnimalRepository repository) {
        this.repository = repository;
    }

    /**
     * Retrieves a list of all animals from the repository.
     *
     * @return A list of Animal objects.
     */
    @GetMapping
    public List<Animal> findAll() {
        // Retrieve all animals from the repository
        return repository.findAll();
    }

    /**
     * Retrieves a list of animals that have not been adopted.
     *
     * @return a list of animals that have not been adopted.
     */
    @GetMapping("/not-adopted")
    public List<Animal> findNotAdopted() {
        return repository.findNotAdopted();
    }

    /**
     * Retrieves a list of all not adopted dogs.
     *
     * @return List of Animal objects representing not adopted dogs
     */
    @GetMapping("/not-adopted/dog")
    public List<Animal> findNotAdoptedDog() {
        return repository.findAll().stream()
                .filter(element -> element.getSpecie().equals("dog"))
                .toList();
    }

    /**
     * Retrieves a list of not adopted cats from the repository.
     *
     * @return a list of not adopted cats
     */
    @GetMapping("/not-adopted/cat")
    public List<Animal> findNotAdoptedCat() {
        return repository.findAll().stream()
                .filter(element -> element.getSpecie().equals("cat"))
                .toList();
    }

    /**
     * Retrieves a list of adopted animals from the repository.
     *
     * @return List of adopted animals
     */
    @GetMapping("/adopted")
    public List<Animal> findAdopted() {
        return repository.findAdopted();
    }

    /**
     * Find all adopted dogs from the repository.
     *
     * @return List of adopted dog animals
     */
    @GetMapping("/adopted/dog")
    public List<Animal> findAdoptedDog() {
        return repository.findAll().stream()
                .filter(element -> element.getSpecie().equals("dog"))
                .toList();
    }

    /**
     * Find all adopted cat animals in the repository.
     *
     * @return         	list of adopted cat animals
     */
    @GetMapping("/adopted/cat")
    public List<Animal> findAdoptedCat() {
        return repository.findAll().stream()
                .filter(element -> element.getSpecie().equals("cat"))
                .toList();
    }

    /**
     * Creates a new animal in the database.
     *
     * @param animal The animal object to be created
     * @return The created animal object
     */
    @PostMapping
    public Animal create(@RequestBody Animal animal) {
        return repository.save(animal);
    }

    /**
     * Retrieves a list of caretakers between a specific start and end date.
     *
     * @return List of caretakers
     */
    @GetMapping("/caretakers")
    public List<String> findCaretakers() {
        // Define the start date
        Date startDate = Date.valueOf("2024-02-15");

        // Define the end date
        Date endDate = Date.valueOf("2025-02-15");

        // Retrieve caretakers from the repository based on the start and end date
        return repository.findCaretakers(startDate, endDate);
    }

    // Example: http://localhost:8081/animals/month?startDate=2024-04-15&endDate=2025-04-15
    /**
     * Retrieves a list of animals based on the specified start and end dates for a month.
     *
     * @param startDate The start date of the month in the format "dd/MM/yyyy".
     * @param endDate The end date of the month in the format "dd/MM/yyyy".
     * @return List of animals found within the specified month.
     */
    @GetMapping("/month")
    public List<Animal> findMonthAnimals(
            @RequestParam(name = "startDate", required = true)
            @DateTimeFormat(pattern = "dd/MM/yyyy") LocalDate startDate,
            @RequestParam(name = "endDate", required = true)
            @DateTimeFormat(pattern = "dd/MM/yyyy") LocalDate endDate)
    {
        return repository.findMonthAnimals(startDate, endDate);
    }
}
