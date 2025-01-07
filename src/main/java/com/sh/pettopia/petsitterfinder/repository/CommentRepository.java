package com.sh.pettopia.petsitterfinder.repository;

import com.sh.pettopia.petsitterfinder.entity.CommentEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<CommentEntity, Long> {


        Page<CommentEntity> findAllByPostIdOrderByCreatedTimeDesc(Long id, Pageable pageable);
}
