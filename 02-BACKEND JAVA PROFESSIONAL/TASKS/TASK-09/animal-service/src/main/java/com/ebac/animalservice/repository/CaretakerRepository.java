package com.ebac.animalservice.repository;

import com.ebac.animalservice.entity.Caretaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CaretakerRepository extends JpaRepository<Caretaker, Integer> {
    /**
     * Find a Caretaker by name.
     *
     * @param  name    the name of the Caretaker to find
     * @return         the Caretaker found by the given name
     */
    Caretaker findByName(String name);
}
