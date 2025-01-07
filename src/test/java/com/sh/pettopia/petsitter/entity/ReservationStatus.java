package com.sh.pettopia.petsitter.entity;

import lombok.Getter;

@Getter
public enum ReservationStatus {
    ready("ready"), OK("OK"), cancel("cancel");

    private final String reservationStatus;

    ReservationStatus(String reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

}
