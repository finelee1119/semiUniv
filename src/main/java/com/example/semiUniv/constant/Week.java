package com.example.semiUniv.constant;

import lombok.Getter;

@Getter
public enum Week {
    // description 생략
    MON ("월"),
    TUE ("화"),
    WED ("수"),
    THU ("목"),
    FRI ("금");

    private final String description;

    Week(String description) {
        this.description = description;
    }
}
