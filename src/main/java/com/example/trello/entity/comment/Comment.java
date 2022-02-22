package com.example.trello.entity.comment;

import com.example.trello.entity.Auditable;
import com.example.trello.entity.task.Task;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.Instant;

@Entity
public class Comment extends Auditable {
    private String context;
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

    @ManyToOne
    private Task task;


}
