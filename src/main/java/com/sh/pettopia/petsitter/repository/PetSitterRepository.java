package com.sh.pettopia.petsitter.repository;

import com.sh.pettopia.petsitter.entity.PetSitter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetSitterRepository extends JpaRepository<PetSitter,String> {

    PetSitter findPetSitterByPetSitterId(String petSitterId);

    @Query("select p from petSitter p where p.petSitterAddress.address like %:address%")
    List<PetSitter> findByPetSitterAddressContaining(@Param("address") String address);

    @Query("select p from petSitter p left join review r on p.petSitterId=r.petSitterId")
    List<PetSitter> findPetSitterJoinReview();

    List<PetSitter> findPetSitterByWorkStatusTrue();
}
