package uz.bakhromjon.entity.project;


import uz.bakhromjon.entity.Auditable;
import uz.bakhromjon.entity.auth.AuthUser;
import uz.bakhromjon.entity.organization.Organization;
import uz.bakhromjon.entity.task.Task;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
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

    private LocalDateTime deadline;

    private boolean closed;

    private boolean archived;


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
