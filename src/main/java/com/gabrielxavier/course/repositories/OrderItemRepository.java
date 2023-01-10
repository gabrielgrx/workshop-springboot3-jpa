package com.gabrielxavier.course.repositories;

import com.gabrielxavier.course.entities.OrderItem;
import com.gabrielxavier.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
