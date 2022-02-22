package com.example.trello.entity.project;


import com.example.trello.entity.Auditable;
import com.example.trello.entity.auth.AuthUser;
import com.example.trello.entity.organization.Organization;
import com.example.trello.entity.task.Task;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.time.Instant;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Project extends Auditable {
    private String name;
    private String tzPath;
    private String description;

    @ManyToOne
    private Organization organization;

    private Instant deadline;

    private Boolean closed;

    private Boolean archived;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "project_member", joinColumns = {@JoinColumn(name = "project_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")})
    private List<AuthUser> users;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "project_id")
    private List<Task> tasks;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "project_id")
    private List<ProjectColumn> projectColumns;
}
