package com.example.trello.entity.project;

import com.example.trello.entity.Auditable;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.Instant;

@Getter
@Setter
@Entity
public class ProjectColumn extends Auditable {
    private String name;
    @ManyToOne
    private Project project;
    @Convert(disableConversion = true)
    @Column(name = "created_at")
    private Instant createdAt;
    @Column(name = "created_by")
    private Long createdBy;
    @Convert(disableConversion = true)
    @Column(name = "updated_at")
    private Instant updatedAt;
    @Column(name = "updated_by")
    private Long updatedBy;
}
