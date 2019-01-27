package com.hottur.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id")
    private Long id;

    @NotNull(message = "Name is mandatory")
    private String name;

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
}
