package com.sh.pettopia.petsitter.entity;

import lombok.Getter;

@Getter
public enum SittingStatus {

    StandbySitting("StandbySitting"), START_SITTING("START_SITTING"),WAITING_MEMBER_CHECK ("WAITING_MEMBER_CHECK"),MEMBER_CHECK("MEMBER_CHECK")
    ,COMPLETED_SITTING("COMPLETED_SITTING");

    private final String sittingStatus;
    SittingStatus(String sittingStatus){
        this.sittingStatus=sittingStatus;
    }
}
