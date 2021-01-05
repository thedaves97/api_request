package com.api.api_request.repository;

import java.util.List;

import com.api.api_request.entity.Order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

    @Query("Select o from Order o where o.email = :email")
    List<Order> findOrderByEmail(@Param("email") String email);

    @Query("Select max(number) from Order o")
    int findMaxOrder();

}
