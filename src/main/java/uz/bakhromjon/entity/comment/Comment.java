package uz.bakhromjon.entity.comment;

import uz.bakhromjon.entity.Auditable;
import uz.bakhromjon.entity.task.Task;
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
