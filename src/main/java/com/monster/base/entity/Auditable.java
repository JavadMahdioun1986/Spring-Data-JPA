package com.monster.base.entity;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Audited
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
@EntityListeners({AuditingEntityListener.class})
public abstract class Auditable implements Serializable {
    @CreatedDate
    @Column(name = "created_date", nullable = false, updatable = false)
    private Date createdDate;

    @CreatedBy
    @Column(name = "created_by", nullable = false, updatable = false)
    private String createdBy;

    @LastModifiedDate
    @Column(name = "last_modified_date")
    private Date lastModifiedDate;

    @LastModifiedBy
    @Column(name = "last_modified_by")
    private String lastModifiedBy;

//    @Version
//    @Column(name = "n_version", nullable = false)
//    private Integer version;

//    public Date getCreatedDate() {
//        return this.createdDate;
//    }
//
//    public String getCreatedBy() {
//        return this.createdBy;
//    }
//
//    public Date getLastModifiedDate() {
//        return this.lastModifiedDate;
//    }
//
//    public String getLastModifiedBy() {
//        return this.lastModifiedBy;
//    }
//
//    public Integer getVersion() {
//        return this.version;
//    }
//
//    public Auditable setCreatedDate(final Date createdDate) {
//        this.createdDate = createdDate;
//        return this;
//    }
//
//    public Auditable setCreatedBy(final String createdBy) {
//        this.createdBy = createdBy;
//        return this;
//    }
//
//    public Auditable setLastModifiedDate(final Date lastModifiedDate) {
//        this.lastModifiedDate = lastModifiedDate;
//        return this;
//    }
//
//    public Auditable setLastModifiedBy(final String lastModifiedBy) {
//        this.lastModifiedBy = lastModifiedBy;
//        return this;
//    }
//
//    public Auditable setVersion(final Integer version) {
//        this.version = version;
//        return this;
//    }
}
