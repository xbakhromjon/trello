package com.example.trello.dto.project;

import com.example.trello.dto.GenericDto;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ProjectDto extends GenericDto {
    private String name;
    private String tz_path;
    private boolean closed;
    private Long orgId;

    @Builder(builderMethodName = "childBuilder")
    public ProjectDto(Long id, String name, String tz_path, boolean closed, Long orgId) {
        super(id);
        this.name = name;
        this.tz_path = tz_path;
        this.closed = closed;
        this.orgId = orgId;
    }
}
