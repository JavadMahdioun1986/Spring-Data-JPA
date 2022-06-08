package com.monster.model.enums;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Status {

    ACTIVE((short)100),
    DI_ACTIVE((short)101)
    ;

    private final Short code; // why should declare it final so the compiler does not throw error for using @RequiredArgsConstructor

}
