package com.api.api_request.repository;

import java.util.List;
import java.util.Optional;

import com.api.api_request.entity.Bevanda;
import com.api.api_request.entity.Locale;
import com.api.api_request.entity.Menu;
import com.api.api_request.entity.MenuKey;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocaleRepository extends JpaRepository<Locale, Integer> {

    // @Query("SELECT name FROM Locale l JOIN FETCH l.bevande Bevanda");
    // List<Bevanda> findBevandaAsB();

    // list<Bevanda> findByBevanda_

    Optional<Locale> findById(Integer id);

}
