package com.hottur.repository;

import com.hottur.entity.Tur;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TurRepository extends CrudRepository<Tur, Long> {
    @Query(value = "SELECT country from tur", nativeQuery = true)
    List<Tur> getCountries(/*@Param("country")*/ String country);

}
