package com.sh.pettopia.choipetsitter.entity;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;



@Data
@Setter(AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Embeddable
public class PetSitterPost {
    // 펫시터가 홍보글을 등록 했을 때
    // 홍보글이 언제 생성이 되고, 언제 업데이트가 되었는가
    // 홍보글의 url 저장도 해야 한다
    // 홍보글에는 어떤 내용이 있는가??
    // 1. 시터 가능한 동물의 사이즈
    // 2. 이용 가능한 서비스들 (빗질, 산책, 약 먹이기, 등등...)

    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime createdAt; // 홍보글이 생성된 날짜

    @Column(name = "updated_at")
    @UpdateTimestamp
    private LocalDateTime updateAt; // 홍보글이 업데이트 된 날짜

    @Column(name = "url")
    private String url;

    // 시터가능한 반려견 사이즈 (대,중,소)
    @Column(name = "available_pet_size")
    @Enumerated(EnumType.STRING)
    private AvailablePetSize availablePetSize;

    // 이용가능한 서비스 ( 빗질, 산책, 약 먹이기, 등등...)
    @Column(name = "available_service")
    @Enumerated(EnumType.STRING)
    private AvailableService availableService;


}
