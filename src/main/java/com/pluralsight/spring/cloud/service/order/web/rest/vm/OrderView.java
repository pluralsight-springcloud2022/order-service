package com.pluralsight.spring.cloud.service.order.web.rest.vm;

public record OrderView(int id, int orderNumber, int customerId) {
}
