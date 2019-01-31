package com.hottur.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "country_sequence")
    @SequenceGenerator(name = "country_sequence", sequenceName = "COUNTRY_SEQ")
    private Long id;

    @NotNull(message = "Country name is mandatory")
    private String name;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Tur> turs;

    public Country() {
    }

    public Country(@NotNull(message = "Name is mandatory") String name) {
        this.name = name;
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

    public List<Tur> getTurs() {
        return turs;
    }

    public void setTurs(List<Tur> turs) {
        this.turs = turs;
    }
}
