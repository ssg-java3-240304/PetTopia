package com.sh.pettopia.choipetsitter.repository;

import com.sh.pettopia.choipetsitter.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayRepository extends JpaRepository<Order,Long> {
}
