package com.example.trello.dto.project;

import com.example.trello.dto.Dto;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Builder
public class ProjectCreateDto implements Dto {
    private String name;
    private String tz_path;
    private boolean closed;
    private Long orgId;

    @Builder(builderMethodName = "childBuilder")
    public ProjectCreateDto(String name, String tz_path, boolean closed, Long orgId) {
        this.name = name;
        this.tz_path = tz_path;
        this.closed = closed;
        this.orgId = orgId;
    }
}
