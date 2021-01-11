package com.api.api_request.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import com.api.api_request.entity.auth.Utente;
import com.api.api_request.repository.auth.UtenteRepository;

@Service
@Transactional
public class UtenteService {

    @Autowired
    UtenteRepository utenteRepository;

    public Optional<Utente> findbyEmail(String email) {
        return utenteRepository.findByEmail(email);
    }

    public boolean existsbyEmail(String email) {
        return utenteRepository.existsByEmail(email);
    }

    public Utente save(Utente utente) {
        return utenteRepository.save(utente);
    }
}
