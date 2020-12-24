package com.api.api_request.repository;

import java.util.List;

import com.api.api_request.entity.Bevanda;
import com.api.api_request.entity.Locale;
import com.api.api_request.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Integer> {
    // public List<Menu> findByPriceLesserThan(int maxPrice);

    @Query("Select m from Menu m where m.price < :maxPrice")
    List<Menu> findBevandaWithMaxPrice(@Param("maxPrice") float maxPrice);

    @Query("Select m from Menu m where m.locale.id = :idLocale")
    List<Menu> findMenuLocaleByIdLocale(@Param("idLocale") int idLocale);

}
