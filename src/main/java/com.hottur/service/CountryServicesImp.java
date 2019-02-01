package com.hottur.service;

import com.hottur.entity.Country;
import com.hottur.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CountryServicesImp implements CountryServices {

    private CountryRepository countryRepository;

    @Autowired
    public void setCountryRepository(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public Iterable<Country> listAllCountry() {
        return countryRepository.findAll();
    }

    @Override
    public Optional<Country> getCountryById(Long id) {
        return Optional.empty();
    }

    @Override
    public Country getCountryByName(String countryName) {
        return null;
    }

    @Override
    public Country getCountryAllTouts(String countryName) {
        return null;
    }

    @Override
    public Country saveCountry(Country nameTur) {
        return null;
    }

    @Override
    public void deleteCountry(Long id) {

    }
}
