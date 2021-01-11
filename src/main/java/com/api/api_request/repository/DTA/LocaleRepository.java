package com.api.api_request.repository.DTA;

import java.util.Optional;

import com.api.api_request.entity.DTA.Locale;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LocaleRepository extends JpaRepository<Locale, Integer> {

    // @Query("SELECT name FROM Locale l JOIN FETCH l.bevande Bevanda");
    // List<Bevanda> findBevandaAsB();

    // list<Bevanda> findByBevanda_

    Optional<Locale> findById(Integer id);

    @Query("Select id from Locale l where l.name = :nameLocale")
    int findIdByNomeLocale(@Param("nameLocale") String nameLocale);

}
