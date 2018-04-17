package com.example.airbnb.home;

import com.example.airbnb.listing.Listing;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
public class Home extends Listing{

    @NotNull
    private String simpleDescription, type, cancellation, typeOfCharge;
    @NotNull
    private int price, guests, beds, baths;

    protected Home() {
    }

    public Home(@NotNull String city,
                @NotNull String state,
                @NotNull String country,
                @NotNull String title,
                @NotNull String simpleDescription,
                @NotNull String type,
                @NotNull String cancellation,
                @NotNull String typeOfCharge,
                @NotNull int price,
                @NotNull int guests,
                @NotNull int beds,
                @NotNull int baths) {
        super(city, state, country, title);
        this.simpleDescription = simpleDescription;
        this.type = type;
        this.cancellation = cancellation;
        this.typeOfCharge = typeOfCharge;
        this.price = price;
        this.guests = guests;
        this.beds = beds;
        this.baths = baths;
    }


}
