package com.example.trello.services.project;

import com.example.trello.criteria.GenericCriteria;
import com.example.trello.dto.project.ProjectCreateDto;
import com.example.trello.dto.project.ProjectDto;
import com.example.trello.dto.project.ProjectUpdateDto;
import com.example.trello.entity.project.Project;
import com.example.trello.services.BaseService;
import com.example.trello.services.GenericCrudService;

import java.util.List;

public interface ProjectService extends GenericCrudService<
        Project,
        ProjectDto,
        ProjectCreateDto,
        ProjectUpdateDto,
        GenericCriteria,
        Long>, BaseService {

    @Override
    Long create(ProjectCreateDto createDto);

    @Override
    Void update(ProjectUpdateDto updateDto);

    @Override
    Void delete(Long id);

    @Override
    List<ProjectDto> getAll(GenericCriteria criteria);

    @Override
    ProjectDto get(Long id);

    @Override
    Long totalCount(GenericCriteria criteria);

}
