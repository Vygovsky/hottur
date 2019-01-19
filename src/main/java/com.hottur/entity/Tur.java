package com.hottur.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;


@Entity
public class Tur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "Name is mandatory")
    private String nameTurOperator;
    @NotNull(message = "Date is mandatory")
    private LocalDate dateMessage;
    @NotNull(message = "Hotel is mandatory")
    private String nameTur;
    @NotNull(message = "Country is mandatory")
    private String country;
    @NotNull(message = "Date is mandatory")
    private LocalDate dateDeparture;
    @NotNull
    private int tourPrice;

    public Tur() {
    }

    public Tur(Long id, String nameTurOperator, LocalDate dateMessage, String nameTur, String country, LocalDate dateDeparture, int tourPrice) {
        this.id = id;
        this.nameTurOperator = nameTurOperator;
        this.dateMessage = dateMessage;
        this.nameTur = nameTur;
        this.country = country;
        this.dateDeparture = dateDeparture;
        this.tourPrice = tourPrice;
    }

    public Tur(String nameTurOperator, LocalDate dateMessage, String nameTur, String country, LocalDate dateDeparture, int tourPrice) {
        this.nameTurOperator = nameTurOperator;
        this.dateMessage = dateMessage;
        this.nameTur = nameTur;
        this.country = country;
        this.dateDeparture = dateDeparture;
        this.tourPrice = tourPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameTurOperator() {
        return nameTurOperator;
    }

    public void setNameTurOperator(String nameTurOperator) {
        this.nameTurOperator = nameTurOperator;
    }

    public LocalDate getDateMassage() {

        return dateMessage;
    }

    public void setDateMassage(LocalDate dateMassage) {
        this.dateMessage = dateMassage;
    }

    public String getNameTur() {
        return nameTur;
    }

    public void setNameTur(String nameTur) {
        this.nameTur = nameTur;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getDateDeparture() {
        return dateDeparture;
    }

    public void setDateDeparture(LocalDate dateDeparture) {
        this.dateDeparture = dateDeparture;
    }

    public int getTourPrice() {
        return tourPrice;
    }

    public void setTourPrice(int tourPrice) {
        this.tourPrice = tourPrice;
    }
}

