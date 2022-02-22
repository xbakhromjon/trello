package com.example.trello.entity.task;


import com.example.trello.entity.Auditable;
import com.example.trello.entity.auth.AuthUser;
import com.example.trello.entity.comment.Comment;
import com.example.trello.entity.project.Project;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Task extends Auditable {
    private String name;

    private String level;

    private String description;

    private boolean closed;

    private String state;

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
