package com.monster.model.entity;

import com.monster.base.entity.BaseEntity;
import com.monster.common.PersistenceConstant;
import com.monster.model.enums.Status;
import java.io.Serial;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.hibernate.envers.Audited;


@Setter
@Getter
@Entity
@Audited
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Table(name = StudentActivity.TABLE_NAME)
@SequenceGenerator(sequenceName = PersistenceConstant.SEQ_STUDENT_ACTIVITY, name = PersistenceConstant.SEQ_GEN_STUDENT_ACTIVITY)
public class StudentActivity extends BaseEntity<Long> {

    @Serial
    private static final long serialVersionUID = -9073255629596850158L;

    public static final String TABLE_NAME = "TBL_STUDENT_ACTIVITY";
//    private static final String SEQUENCE_NAME = TABLE_NAME + "_SEQ";
//    private static final String GENERATOR_NAME= TABLE_NAME + "_GEN";

//    @Id
//    @SequenceGenerator(name = GENERATOR_NAME, sequenceName = SEQUENCE_NAME, allocationSize = 1, initialValue = 1)
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GENERATOR_NAME)
//    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false) // fetch type by default is EAGER in ManyToOne.
    @JoinColumn(name = "student_id", referencedColumnName = "id", nullable = false) // nullable = false for database
//    @JoinColumn(name = "type", nullable = false, referencedColumnName = "code")
    @NotNull(message = "{err.student-activity.student.null}") // @NotNull for controller and check it with @Valid
//    @Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED) // ?
    private Student student;

//    @Enumerated(EnumType.STRING)
    @Enumerated(EnumType.ORDINAL)
    private Status status;

    @Column(name = "status_change_date")
    @NotNull(message = "{err.student-activity.status-change-date.null}")
    private Timestamp statusChangeDate;

}
