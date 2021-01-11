package com.api.api_request.service;

import java.util.Optional;

import javax.transaction.Transactional;

import com.api.api_request.entity.auth.Ruolo;
import com.api.api_request.enums.RuoloEnum;
import com.api.api_request.repository.auth.RuoloRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RuoloService {

    @Autowired
    RuoloRepository ruoloRepository;

    public Optional<Ruolo> getbyRuoloEnum(RuoloEnum ruoloEnum) {
        return ruoloRepository.findByRuoloEnum(ruoloEnum);
    }

    public boolean existsbyRuoloEnum(RuoloEnum ruoloEnum) {
        return ruoloRepository.existsByRuoloEnum(ruoloEnum);
    }

    public void save(Ruolo ruolo) {
        ruoloRepository.save(ruolo);
    }
}
