package com.example.airbnb.listing;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@MappedSuperclass
public abstract class Listing {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    private String city, state, country, title;

    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> photos;

    {
        photos = new ArrayList<>();
    }

    protected Listing() {
    }

    public Listing(@NotNull String city,
                   @NotNull String state,
                   @NotNull String country,
                   @NotNull String title) {
        this.city = city;
        this.state = state;
        this.country = country;
        this.title = title;
    }

    public void addPhoto(String photo) {
        photos.add(photo);
    }
}
