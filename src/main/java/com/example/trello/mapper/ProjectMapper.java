package com.example.trello.mapper;

import com.example.trello.dto.project.ProjectCreateDto;
import com.example.trello.dto.project.ProjectDto;
import com.example.trello.dto.project.ProjectUpdateDto;
import com.example.trello.entity.project.Project;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface ProjectMapper extends BaseMapper<
        Project,
        ProjectDto,
        ProjectCreateDto,
        ProjectUpdateDto>{

    @Override
    ProjectDto toDto(Project project);

    @Override
    List<ProjectDto> toDto(List<Project> e);

    @Override
    Project fromCreateDto(ProjectCreateDto projectCreateDto);

    @Override
    Project fromUpdateDto(ProjectUpdateDto d);
}
