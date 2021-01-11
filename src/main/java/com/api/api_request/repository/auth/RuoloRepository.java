package com.api.api_request.repository.auth;

import java.util.Optional;

import com.api.api_request.entity.auth.Ruolo;
import com.api.api_request.enums.RuoloEnum;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RuoloRepository extends JpaRepository<Ruolo, Integer> {

    Optional<Ruolo> findByRuoloEnum(RuoloEnum ruoloEnum);

    boolean existsByRuoloEnum(RuoloEnum ruoloEnum);
}