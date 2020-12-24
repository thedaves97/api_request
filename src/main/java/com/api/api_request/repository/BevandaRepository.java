package com.api.api_request.repository;

import com.api.api_request.entity.Bevanda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BevandaRepository extends JpaRepository<Bevanda, Integer>
{
}
