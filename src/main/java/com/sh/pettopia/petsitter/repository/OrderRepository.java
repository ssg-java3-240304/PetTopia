package com.sh.pettopia.petsitter.repository;

import com.sh.pettopia.petsitter.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order,String > {
    Order findOrderByPartnerOrderId(String partnerOrderId);

    Order deleteOrderByPartnerOrderId(String partnerOrderId);

    List<Order> findAllByOrderByPayDate();
}
