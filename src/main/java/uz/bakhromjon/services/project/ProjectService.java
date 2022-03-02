package uz.bakhromjon.services.project;

import uz.bakhromjon.criteria.GenericCriteria;
import uz.bakhromjon.dto.project.ProjectCreateDto;
import uz.bakhromjon.dto.project.ProjectDto;
import uz.bakhromjon.dto.project.ProjectUpdateDto;
import uz.bakhromjon.entity.project.Project;
import uz.bakhromjon.services.BaseService;
import uz.bakhromjon.services.GenericCrudService;

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
