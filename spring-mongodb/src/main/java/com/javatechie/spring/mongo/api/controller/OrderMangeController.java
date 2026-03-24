package com.javatechie.spring.mongo.api.controller;

import java.util.List;

import com.javatechie.spring.mongo.api.model.User;
import com.javatechie.spring.mongo.api.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/order")
public class OrderMangeController {

    @Autowired
    private OrderRepository orderRepository;

    @PostMapping("/placeOrder")
    public String placeOrder(@RequestBody User user) {
        orderRepository.save(user);
        return "Order placed successfully...";
    }

    @GetMapping("/getUserByName/{name}")
    public List<User> getUserByName(@PathVariable String name) {
        return orderRepository.findByName(name);
    }

    @GetMapping("/getUserByAddress/{city}")
    public List<User> getUserByAddress(@PathVariable String city) {
        return orderRepository.findByCity(city);
    }

}
