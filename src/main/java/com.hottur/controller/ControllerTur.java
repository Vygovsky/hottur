package com.hottur.controller;

import com.hottur.entity.Country;
import com.hottur.entity.Tur;
import com.hottur.repository.CountryRepository;
import com.hottur.service.CountryServices;
import com.hottur.service.TurServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
public class ControllerTur {

    private TurServices turServices;
    private CountryRepository countryRepository;

    @Autowired
    public void setCountryRepository(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Autowired
    public void setTurServices(TurServices turServices) {
        this.turServices = turServices;
    }

    @RequestMapping(value = "/tours", method = RequestMethod.GET)
    public String getAllHotTurShow(Map<String, Object> model) {
        model.put("all_ListTur", turServices.listAllTur());
        return "tours";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addTour(Map<String, Object> model) {
        model.put("tour", new Tur());
        return "tourform";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveTour(@Valid Tur tour, BindingResult result, Map<String, Object> model) {
        if (result.hasErrors()) {
            return "tourform";
        }
        turServices.saveTur(tour);
        model.put("tour", turServices.listAllTur());
        return "redirect:/tours";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String editTour(@PathVariable("id") Long id, Map<String, Object> model) {
        Optional<Tur> tur = turServices.getTurById(id);
        Iterable<Country> all = countryRepository.findAll();
        model.put("editTour", tur);
        model.put("country", all);
        return "touredit";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST, headers = "Accept=application/x-www-form-urlencoded")
    public String updateTour(@PathVariable("id") Long id, @Valid Tur tur, BindingResult result, Map<String, Object> model) {
        if (result.hasErrors()) {
            tur.setId(id);
            return "touredit";
        }
        turServices.saveTur(tur);
        model.put("all_ListTur", turServices.listAllTur());
        return "tours";
    }


    @RequestMapping("/tour/delete/{id}")
    public String deleteTour(@PathVariable Long id) {
        turServices.deleteTur(id);
        return "redirect:/tours";
    }
}
