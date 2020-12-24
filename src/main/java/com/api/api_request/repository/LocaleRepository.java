package com.api.api_request.repository;

<<<<<<< HEAD
import java.util.List;
import java.util.Optional;
=======
>>>>>>> ea7f51b8be7fc4d16441add1ced3433d368a1522

import com.api.api_request.entity.Bevanda;
import com.api.api_request.entity.Locale;
import com.api.api_request.entity.Menu;
import com.api.api_request.entity.MenuKey;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
<<<<<<< HEAD
public interface LocaleRepository extends JpaRepository<Locale, Integer> {
=======
public interface LocaleRepository extends JpaRepository<Locale, Integer>
{
    //@Query
    //public List<Bevanda> findAllByDescriptionQuery(Integer id);
    //public List<Bevanda> findByBevande_Id(Integer id);
>>>>>>> ea7f51b8be7fc4d16441add1ced3433d368a1522

    // @Query("SELECT name FROM Locale l JOIN FETCH l.bevande Bevanda");
    // List<Bevanda> findBevandaAsB();

    // list<Bevanda> findByBevanda_

    Optional<Locale> findById(Integer id);

}
