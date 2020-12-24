package com.api.api_request.controller;


import com.api.api_request.entity.Locale;
import com.api.api_request.repository.LocaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class LocaleController {

    @Autowired
    private LocaleRepository localeRepository;

    @GetMapping("/locale")
    public List<Locale> getAllLocali() { return localeRepository.findAll(); }
}

