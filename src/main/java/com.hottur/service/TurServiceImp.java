package com.hottur.service;

import com.hottur.entity.Tur;
import com.hottur.repository.TurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TurServiceImp implements TurServices {

    private TurRepository turRepository;

    @Autowired
    public void setTurRepository(TurRepository turRepository) {
        this.turRepository = turRepository;
    }

    @Override
    public Iterable<Tur> listAllTur() {
        return turRepository.findAll();
    }

    @Override
    public Optional<Tur> getTurById(Long id) {
        return turRepository.findById(id);
    }

    @Override
    public Tur getTurByName(String nameTur) {
        return null;
    }

    @Override
    public Tur getTurByCountry(String country) {
        return null;
    }

    @Override
    public Tur saveTur(Tur nameTur) {
        return turRepository.save(nameTur);
    }

    @Override
    public void deleteTur(Long id) {
        turRepository.deleteById(id);
    }

    @Override
    public List<Tur> getCountries(Long id) {
        return turRepository.getCountries(id);
    }
}
