package com.api.api_request.controller;

import com.api.api_request.entity.Bevanda;
import com.api.api_request.repository.BevandaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class BevandaController {

    @Autowired
    private BevandaRepository bevandaRepository;

    @GetMapping("/bevanda")
    public List<Bevanda> getAllBevande() { return bevandaRepository.findAll(); }
}
