package com.ebac.memems.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.sql.Date;

@Entity
@NoArgsConstructor
//@Data -> Não será estipulado automaticamente um Setter para ID
@Slf4j
public class Meme {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "meme_sequence")
    @Column(name = "id")
    private Long id;

    @Getter
    @Setter
    @Column(name = "name")
    private String name;

    @Getter
    @Setter
    @Column(name = "description")
    private String description;

    @Getter
    @Setter
    @Column(name = "registered_date")
    private Date registeredDate;

    @Getter
    @Setter
    @Column(name = "category")
    private String category;

    @Getter
    @Setter
    @Column(name = "user")
    private String user;
}
