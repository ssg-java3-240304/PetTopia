package com.sh.pettopia.user.admin.repository;

import com.sh.pettopia.user.admin.entity.PetsitterQualificationApplicationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<PetsitterQualificationApplicationEntity, Long> {
}
