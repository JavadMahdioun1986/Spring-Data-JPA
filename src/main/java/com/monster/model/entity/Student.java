package com.monster.model.entity;

import com.monster.base.entity.BaseEntity;
import com.monster.common.PersistenceConstant;
import java.io.Serial;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
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
@Table(name = Student.TABLE_NAME)
@SequenceGenerator(sequenceName = PersistenceConstant.SEQ_STUDENT, name = PersistenceConstant.SEQ_GEN_STUDENT)
public class Student extends BaseEntity<Long> {

    @Serial
    private static final long serialVersionUID = 4605602028809921803L;

    public static final String TABLE_NAME = "TBL_STUDENT";
//    private static final String SEQUENCE_NAME = TABLE_NAME + "_SEQ";
//    private static final String GENERATOR_NAME = TABLE_NAME + "_GEN";

//    @Id
//    @SequenceGenerator(name = GENERATOR_NAME, sequenceName = SEQUENCE_NAME, allocationSize = 1, initialValue = 1)
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GENERATOR_NAME)
//    private Long id;

    @Column(name = "name", nullable = false)
    private String name;



    @OneToMany(
        cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
        orphanRemoval = true,
        mappedBy = "student",
        fetch = FetchType.LAZY
    )
    private List<StudentActivity> activities;

}