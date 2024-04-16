package com.ebac.animalservice.repository;

import com.ebac.animalservice.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {
    @Query("SELECT element FROM Animal element WHERE element.dataAdocao is NULL order by element.dataEntrada")
    List<Animal> findNotAdopted();

    @Query("SELECT element FROM Animal element WHERE element.dataAdocao is NOT NULL order by element.dataEntrada")
    List<Animal> findAdopted();
}
