package com.api.api_request.controller;

import java.util.Date;
import java.util.List;

import com.api.api_request.entity.Menu;
import com.api.api_request.entity.Order;
import com.api.api_request.repository.MenuRepository;
import com.api.api_request.repository.OrderRepository;
import com.fasterxml.jackson.databind.JsonNode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private MenuRepository menuRepository;

    @GetMapping("/getAllOrders")
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @GetMapping(value = "/orders")
    @ResponseBody
    public List<Order> getOrdersByEmail(@RequestParam String email) {
        return orderRepository.findOrderByEmail(email);
    }

    @PostMapping(value = "/saveOrder", consumes = "application/json", produces = "application/json")
    public boolean updatePerson(@RequestBody JsonNode payload) {
        String localID = payload.get("localID").textValue();
        String userEmail = payload.get("userEmail").textValue();

        int lastOrderNumber = orderRepository.findMaxOrder();

        for (JsonNode jsonNode : payload) {

            JsonNode drinkID = jsonNode.get("drinkID");
            JsonNode drinkPrice = jsonNode.get("drinkPrice");
            JsonNode drinkNumerosity = jsonNode.get("drinkNumerosity");

            if (drinkID != null && drinkPrice != null && drinkNumerosity != null) {

                Order order = new Order(userEmail, lastOrderNumber + 1, drinkNumerosity.asInt(), new Date());
                Menu menu = menuRepository.findMenuByIDs(Integer.parseInt(localID),
                        Integer.parseInt(drinkID.textValue()));

                order.setMenu(menu);

                order.setId_bevanda(menu.getId().getId_bevanda());
                order.setId_locale(menu.getId().getId_locale());

                orderRepository.save(order);
            }

        }

        System.out.println(payload);
        return true;
    }
}
