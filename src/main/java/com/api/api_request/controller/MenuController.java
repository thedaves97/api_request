package com.api.api_request.controller;


import com.api.api_request.entity.Bevanda;
import com.api.api_request.entity.Menu;
import com.api.api_request.repository.BevandaRepository;
import com.api.api_request.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")                  //URL di chiamata
@CrossOrigin
public class MenuController {

    @Autowired
    private MenuRepository menuRepository;

    @GetMapping("/menu")
    public List<Menu> getAllMenus() { return menuRepository.findAll(); }
}
