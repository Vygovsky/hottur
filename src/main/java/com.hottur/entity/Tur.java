package com.hottur.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
public class Tur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "Name is mandatory")
    private String nameTurOperator;
    @NotNull(message = "Date is mandatory")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalDate dateMessage;
    @NotNull(message = "Hotel is mandatory")
    private String nameTur;
    @NotNull(message = "Country is mandatory")
    @OneToOne(mappedBy = "country", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY/*, optional = false*/)
    private Long country_id;
    @NotNull(message = "Date is mandatory")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime dateDeparture;
    @NotNull(message = "Price is mandatory")
    private int tourPrice;

    public Tur() {
    }

    public Tur(Long id, String nameTurOperator, LocalDate dateMessage, String nameTur, Long country_id, LocalDateTime dateDeparture, int tourPrice) {
        this.id = id;
        this.nameTurOperator = nameTurOperator;
        this.dateMessage = dateMessage;
        this.nameTur = nameTur;
        this.country_id = country_id;
        this.dateDeparture = dateDeparture;
        this.tourPrice = tourPrice;
    }

    public Tur(String nameTurOperator, LocalDate dateMessage, String nameTur, Long country_id, LocalDateTime dateDeparture, int tourPrice) {
        this.nameTurOperator = nameTurOperator;
        this.dateMessage = dateMessage;
        this.nameTur = nameTur;
        this.country_id = country_id;
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

    public Long getCountry() {
        return country_id;
    }

    public void setCountry(Long country) {
        this.country_id = country;
    }

    public LocalDateTime getDateDeparture() {
        return dateDeparture;
    }

    public void setDateDeparture(LocalDateTime dateDeparture) {
        this.dateDeparture = dateDeparture;
    }

    public int getTourPrice() {
        return tourPrice;
    }

    public void setTourPrice(int tourPrice) {
        this.tourPrice = tourPrice;
    }


}

