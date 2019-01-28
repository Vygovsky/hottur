package com.hottur.service;

import com.hottur.entity.Tur;

import java.util.List;
import java.util.Optional;


public interface TurServices {

    Iterable<Tur> listAllTur();

    Optional<Tur> getTurById(Long id);

    Tur getTurByName(String nameTur);

    Tur getTurByCountry(String country);

    Tur saveTur(Tur nameTur);

    void deleteTur(Long id);


    List<Tur> getCountries(Long id);

}
