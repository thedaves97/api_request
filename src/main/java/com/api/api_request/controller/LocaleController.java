package com.api.api_request.controller;

import com.api.api_request.entity.Bevanda;
import com.api.api_request.entity.Locale;
import com.api.api_request.entity.MenuKey;
import com.api.api_request.repository.BevandaRepository;
import com.api.api_request.repository.LocaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class LocaleController {

    @Autowired
    private LocaleRepository localeRepository;

    @GetMapping("/locale")
    public List<Locale> getAllLocali() {
        return localeRepository.findAll();
    }

    @GetMapping(value = "/getId")
    @ResponseBody
    public int getIdByNameLocale(@RequestParam String nameLocale) {
        return localeRepository.findIdByNomeLocale(nameLocale);
    }

}
