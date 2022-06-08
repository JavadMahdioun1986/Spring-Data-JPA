package com.monster.common;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class PersistenceConstant {

    public static final String SEQ_STUDENT = "seq_student";
    public static final String SEQ_STUDENT_ACTIVITY = "seq_student_activity";

    public static final String SEQ_GEN_STUDENT = "seq_gen_student";
    public static final String SEQ_GEN_STUDENT_ACTIVITY = "seq_gen_student_activity";

}
