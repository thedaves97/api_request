package com.api.api_request.repository;

import com.api.api_request.entity.Locale;
import com.api.api_request.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Integer> {

}
