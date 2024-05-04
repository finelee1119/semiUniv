package com.example.semiUniv.constant;

import lombok.Getter;

@Getter
public enum Complete {
    P ("이수"),
    NP ("미이수");
// PASS / NONE PASS
    private final String description;

    Complete(String description) {
        this.description = description;
    }
}
