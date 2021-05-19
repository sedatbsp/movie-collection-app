package com.sedatbsp.ozguryazilim.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int releaseYear;
    private String genre;

    @Column(length = 1000)
    private String description;

    private String media;

    private String languageOption;

    @Column(unique = true)
    @OneToMany(cascade = CascadeType.ALL)
    private List<Actor> actors;

    private String nameOfActors;

    public Movie() {

    }

    public Movie(Long id,String name, int releaseYear, String genre, String description, String media, String languageOption, String nameOfActors, List<Actor> actors) {
        this.id = id;
        this.name = name;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.description = description;
        this.media = media;
        this.languageOption = languageOption;
        this.nameOfActors = nameOfActors;
        this.actors = actors;
    }

    public Movie(String name, int releaseYear, String genre, String description, String media, String languageOption, String nameOfActors, List<Actor> actors) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.description = description;
        this.media = media;
        this.languageOption = languageOption;
        this.nameOfActors = nameOfActors;
        this.actors = actors;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguageOption() {
        return languageOption;
    }

    public void setLanguageOption(String languageOption) {
        this.languageOption = languageOption;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public String getNameOfActors() {
        return nameOfActors;
    }

    public void setNameOfActors(String nameOfActors) {
        this.nameOfActors = nameOfActors;
    }
}
