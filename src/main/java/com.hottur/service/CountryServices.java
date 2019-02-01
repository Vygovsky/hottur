package com.hottur.service;

import com.hottur.entity.Country;
import com.hottur.entity.Tur;

import java.util.Optional;

public interface CountryServices {

    Iterable<Country> listAllCountry();

    Optional<Country> getCountryById(Long id);

    Country getCountryByName(String countryName);

    Country getCountryAllTouts(String countryName);

    Country saveCountry(Country nameTur);

    void deleteCountry(Long id);
    /* Country getCountryByName(Long country_id);*/
}
