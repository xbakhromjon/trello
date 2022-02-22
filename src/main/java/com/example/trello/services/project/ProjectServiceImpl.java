package com.example.trello.services.project;

import com.example.trello.criteria.GenericCriteria;
import com.example.trello.dto.project.ProjectCreateDto;
import com.example.trello.dto.project.ProjectDto;
import com.example.trello.dto.project.ProjectUpdateDto;
import com.example.trello.mapper.ProjectMapper;
import com.example.trello.repository.ProjectRepository;
import com.example.trello.services.AbstractService;
import com.example.trello.utils.validators.project.ProjectValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl extends AbstractService<ProjectRepository, ProjectMapper, ProjectValidator>
        implements ProjectService {

    @Autowired
    protected ProjectServiceImpl(ProjectRepository repository, ProjectMapper mapper, ProjectValidator validator) {
        super(repository, mapper, validator);
    }

    @Override
    public Long create(ProjectCreateDto createDto) {
        return null;
    }

    @Override
    public Void delete(Long id) {
        return null;
    }

    @Override
    public Void update(ProjectUpdateDto updateDto) {
        return null;
    }

    @Override
    public List<ProjectDto> getAll(GenericCriteria criteria) {
        return null;
    }

    @Override
    public ProjectDto get(Long id) {
        return null;
    }

    @Override
    public Long totalCount(GenericCriteria criteria) {
        return null;
    }

    @Override
    public Void block(Long id) {
        return null;
    }

    @Override
    public Void unblock(Long id) {
        return null;
    }
}
