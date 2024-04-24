package com.ebac.memems.repository;

import com.ebac.memems.entity.Meme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemeRepository extends JpaRepository<Meme, Long> {
    @Query("SELECT m FROM Meme m WHERE m.user = :user")
    List<Meme> memeByUser(@Param("user") String user);

    @Query("SELECT m FROM Meme m WHERE m.category = :category")
    List<Meme> memeByCategory(@Param("category") String category);
}
