package com.pluralsight.spring.cloud.service.order.web.rest;

import com.pluralsight.spring.cloud.service.order.web.rest.vm.OrderView;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/${app.api.version}/orders")
public class OrderResource {

    @GetMapping("/{id}")
    ResponseEntity<OrderView> getOrderById(@PathVariable int id) {
        return new ResponseEntity<>(new OrderView(1, 1000, 1), HttpStatus.OK);
    }

}
