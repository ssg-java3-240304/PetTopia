package com.sh.pettopia.petsitterfinder.dto;

import com.sh.pettopia.pet.entity.PetSize;
import com.sh.pettopia.petsitterfinder.entity.RequestService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PetDetailsUpdateRequestDto {

    private Long postId;
    private String additionalInfo;
    private LocalDate requestEndDate;
    private LocalDate requestStartDate;
    private PetSize petSize;
    private Set<RequestService> requestService;

}
