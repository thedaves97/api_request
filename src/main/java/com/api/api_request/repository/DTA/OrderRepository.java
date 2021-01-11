package com.api.api_request.repository.DTA;

import java.util.List;

import com.api.api_request.entity.DTA.Order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

    @Query("Select o from Order o where o.email = :email order by o.timestamp desc")
    List<Order> findOrderByEmail(@Param("email") String email);

    @Query("Select max(number) from Order o")
    int findMaxOrder();

    @Query("Select Sum(o.numerosity) from Order o where o.id_locale = :idLocale")
    int getOrderDrinkQuantity(@Param("idLocale") int idLocale);

}
