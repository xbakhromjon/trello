package com.example.trello.entity.project;

import com.example.trello.entity.BaseEntity;
import com.example.trello.entity.organization.Organization;
import com.example.trello.entity.task.Task;
import jdk.jfr.Enabled;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "project",schema = "trello")
public class Project implements BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String tzPath;
    private String description;
    //Todo date change
    private Date deadline;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name= "organization_id")
    private Organization organization;
    private Boolean closed;
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
    @OneToMany
    @JoinColumn(name = "project_id")
    private List<ProjectColumn> columns;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "project_id")
    private List<Task> tasks;
}
