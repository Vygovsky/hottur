package com.hottur.controller;

import com.hottur.entity.Tur;
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
    public String editTour(@PathVariable("id") Long id, @RequestParam String country, Map<String, Object> model) {
        Optional<Tur> tur = turServices.getTurById(id);
        List<Tur> countries = turServices.getCountries(country);
        model.put("editTour", tur);
        model.put("countries", countries);
        return "touredit";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, headers = "Accept=application/x-www-form-urlencoded")
    public String updateTour(@RequestParam("id") Long id, @Valid Tur tur, @RequestParam String country, BindingResult result, Map<String, Object> model) {
        Optional<Tur> turById = turServices.getTurById(id);

        if (result.hasErrors()) {
            return "touredit";
        }

        turServices.saveTur(tur);
       // List<Tur> countries = turServices.getCountries(country);
        model.put("all_ListTur", turServices.listAllTur());
       // model.put("countries", countries);
        return "redirect:/tours" + turById;
    }


    @RequestMapping("/tour/delete/{id}")
    public String deleteTour(@PathVariable Long id) {
        turServices.deleteTur(id);
        return "redirect:/tours";
    }
}
