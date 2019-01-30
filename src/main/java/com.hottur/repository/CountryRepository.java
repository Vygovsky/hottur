package com.hottur.repository;

import com.hottur.entity.Country;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import java.util.List;

public interface CountryRepository extends CrudRepository<Country, Long> {
    @Query(value = "SELECT country FROM  tur where  id=:id;", nativeQuery = true)
    Country getCountryByName(Long country_id);

}