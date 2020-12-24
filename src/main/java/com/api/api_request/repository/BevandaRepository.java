package com.api.api_request.repository;

import java.util.List;

import com.api.api_request.entity.Bevanda;
import com.api.api_request.entity.Locale;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BevandaRepository extends JpaRepository<Bevanda, Integer> {

    public List<Locale> findByLocali_Id(int id);

}
