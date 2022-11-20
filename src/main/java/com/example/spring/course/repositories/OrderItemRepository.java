package com.example.spring.course.repositories;

import com.example.spring.course.entities.OrderItem;
import com.example.spring.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
