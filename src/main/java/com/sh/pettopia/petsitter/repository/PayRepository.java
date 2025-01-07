package com.sh.pettopia.petsitter.repository;

import com.sh.pettopia.petsitter.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayRepository extends JpaRepository<Order,Long> {
}
