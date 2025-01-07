package com.sh.pettopia.petsitter.entity;

import lombok.Getter;

@Getter
public enum AvailablePetSize {

    smallPet("smallPet"), middlePet("middlePet"), largePet("largePet");

    private final String petSize;

    AvailablePetSize(String petSize) {
        this.petSize = petSize;
    }





}
