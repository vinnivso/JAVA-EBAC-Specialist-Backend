package com.ebac.animalservice.controller;

import com.ebac.animalservice.entity.Animal;
import com.ebac.animalservice.entity.Caretaker;
import com.ebac.animalservice.repository.AnimalRepository;
import com.ebac.animalservice.repository.CaretakerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/caretakers")
public class CaretakerController {
    private AnimalRepository animalRepository;
    private final CaretakerRepository repository;

    public CaretakerController(AnimalRepository animalRepository, CaretakerRepository repository) {
        this.animalRepository = animalRepository;
        this.repository = repository;
    }

    /**
     * Retrieves all caretakers from the repository.
     *
     * @return A list of Caretaker objects.
     */
    @GetMapping
    public List<Caretaker> findAll() {
        return repository.findAll();
    }

    /**
     * Retrieves a caretaker by name.
     *
     * @param name The name of the caretaker to find.
     * @return The caretaker with the specified name.
     */
    @GetMapping(value="/{name}")
    public Caretaker findByName(@PathVariable String name) {
        return repository.findByName(name);
    }
    /**
     * Creates a new Caretaker.
     *
     * @param caretaker The Caretaker object to be created.
     * @return The newly created Caretaker object saved in the repository.
     */
    @PostMapping
    public Caretaker create(@RequestBody Caretaker caretaker) {
        return repository.save(caretaker);
    }

}
