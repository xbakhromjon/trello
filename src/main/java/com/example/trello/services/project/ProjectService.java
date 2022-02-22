package com.example.trello.services.project;

import com.example.trello.criteria.GenericCriteria;
import com.example.trello.dto.project.ProjectCreateDto;
import com.example.trello.dto.project.ProjectDto;
import com.example.trello.dto.project.ProjectUpdateDto;
import com.example.trello.entity.project.Project;
import com.example.trello.services.BaseService;
import com.example.trello.services.GenericCrudService;

public interface ProjectService extends GenericCrudService<
        Project,
        ProjectDto,
        ProjectCreateDto,
        ProjectUpdateDto,
        GenericCriteria,
        Long>, BaseService {
}
