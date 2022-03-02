package uz.bakhromjon.entity.task;


import uz.bakhromjon.entity.Auditable;
import uz.bakhromjon.entity.auth.AuthUser;
import uz.bakhromjon.entity.comment.Comment;
import uz.bakhromjon.entity.project.Project;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Task extends Auditable {
    private String name;

    private String priority;

    private String description;

    private String state;

    private LocalDateTime deadLine;

    private boolean closed;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "task_member", joinColumns = {@JoinColumn(name = "task_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")})
    private List<AuthUser> users;

    @ManyToOne
    private Project project;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "task_id")
    private List<Comment> comments;
}
