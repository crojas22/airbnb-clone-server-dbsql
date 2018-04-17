package com.example.airbnb.location;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private double latitude, longitude;

    protected Location() {
    }

    public Location(double latitude,
                    double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
