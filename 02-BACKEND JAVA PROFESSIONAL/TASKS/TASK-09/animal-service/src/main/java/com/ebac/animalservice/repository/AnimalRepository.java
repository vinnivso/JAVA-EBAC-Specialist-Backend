package com.ebac.animalservice.repository;

import com.ebac.animalservice.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {
    @Query("SELECT element FROM Animal element WHERE element.adoptionDate is NULL order by element.inputDate")
    List<Animal> findNotAdopted();

    @Query("SELECT element FROM Animal element WHERE element.adoptionDate is NOT NULL order by element.inputDate")
    List<Animal> findAdopted();

    @Query("SELECT element.caretaker, COUNT(*) as animalQuantity FROM Animal element WHERE element.inputDate >= :startDate AND element.inputDate <= :endDate GROUP BY element.caretaker")
    List<String> findCaretakers(
            @Param("startDate") Date startDate,
            @Param("endDate") Date endDate
    );

    @Query("SELECT element FROM Animal element WHERE element.inputDate >= :startDate AND element.inputDate <= :endDate")
    List<Animal> findMonthAnimals(LocalDate startDate, LocalDate endDate);
}
