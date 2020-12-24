package com.api.api_request.repository;


import com.api.api_request.entity.Bevanda;
import com.api.api_request.entity.Locale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocaleRepository extends JpaRepository<Locale, Integer>
{
    //@Query
    //public List<Bevanda> findAllByDescriptionQuery(Integer id);
    //public List<Bevanda> findByBevande_Id(Integer id);

}

