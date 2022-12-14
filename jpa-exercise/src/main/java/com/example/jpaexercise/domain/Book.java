package com.example.jpaexercise.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    private Long id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
}
