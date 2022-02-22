package com.example.trello.entity.comment;

import com.example.trello.entity.Auditable;
import com.example.trello.entity.task.Task;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Setter
@Getter
@Entity
public class Comment extends Auditable {
    private String context;

    @ManyToOne
    private Task task;
}
