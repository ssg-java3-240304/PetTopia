package com.sh.pettopia.parktj.petsitterfinder.dto;

import com.sh.pettopia.Hojji.pet.entity.PetSize;
import com.sh.pettopia.parktj.petsitterfinder.entity.CareRegistration;
import com.sh.pettopia.parktj.petsitterfinder.entity.ReservationByPetSitter;
import com.sh.pettopia.parktj.petsitterfinder.entity.ReservationStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReservationResponseDto {

    private String petSitterId;

    private String introduce;

//    private String address;

    private ReservationStatus status;

    private Long reservationId;

    private Long postId;

    private LocalDate createdDate;

    private String message;

    private Long memberId;

    private LocalDate startDate;

    private LocalDate endDate;

    private String address;

    private PetSize petSize;

    private String petName;


    public static ReservationResponseDto fromReservations(ReservationByPetSitter reservationByPetSitters){
        return ReservationResponseDto.builder()
                .petSitterId(reservationByPetSitters.getPetSitter().getPetSitterId())
                .introduce(reservationByPetSitters.getPetSitter().getIntroduce())
//                .address(String.valueOf(reservationByPetSitters.getPetSitter().getPetSitterAddress().getAddress()))
                .status(reservationByPetSitters.getReservationStatus())
                .reservationId(reservationByPetSitters.getReservationId())
                .postId(reservationByPetSitters.getPostId())
                .createdDate(reservationByPetSitters.getCreatedDate())
                .memberId(reservationByPetSitters.getMemberId())
                .startDate(reservationByPetSitters.getStartDate())
                .endDate(reservationByPetSitters.getEndDate())
                .address(reservationByPetSitters.getAddress())
                .petSize(reservationByPetSitters.getSize())
                .petName(reservationByPetSitters.getPetName())
                .build();
    }
    public ReservationResponseDto(String message){
        this.message = message;
    }
}
