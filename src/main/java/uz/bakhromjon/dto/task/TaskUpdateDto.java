package uz.bakhromjon.dto.task;

import uz.bakhromjon.dto.GenericDto;
import uz.bakhromjon.entity.auth.AuthUser;
import uz.bakhromjon.entity.comment.Comment;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class TaskUpdateDto extends GenericDto {

    private String name;

    private String priority;

    private String description;

    private boolean closed;

    private LocalDateTime deadLine;

    private String state;

    private List<AuthUser> users;

    private List<Comment> comments;

    @Builder(builderMethodName = "childBuilder")

    public TaskUpdateDto(Long id, String name, String priority, String description, boolean closed, LocalDateTime deadLine, String state, List<AuthUser> users, List<Comment> comments) {
        super(id);
        this.name = name;
        this.priority = priority;
        this.description = description;
        this.closed = closed;
        this.deadLine = deadLine;
        this.state = state;
        this.users = users;
        this.comments = comments;
    }
}

