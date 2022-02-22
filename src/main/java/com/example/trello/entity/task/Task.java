package com.example.trello.entity.task;

import com.example.trello.entity.Auditable;
import com.example.trello.entity.comment.Comment;
import com.example.trello.entity.project.Project;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;
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
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "task_id")
    private List<Comment> comments;
}
