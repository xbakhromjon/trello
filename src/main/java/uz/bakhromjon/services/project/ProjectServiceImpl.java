package uz.bakhromjon.services.project;

import uz.bakhromjon.criteria.GenericCriteria;
import uz.bakhromjon.dto.project.ProjectCreateDto;
import uz.bakhromjon.dto.project.ProjectDto;
import uz.bakhromjon.dto.project.ProjectUpdateDto;
import uz.bakhromjon.entity.project.Project;
import uz.bakhromjon.mapper.ProjectMapper;
import uz.bakhromjon.repository.ProjectRepository;
import uz.bakhromjon.services.AbstractService;
import uz.bakhromjon.utils.validators.project.ProjectValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl extends AbstractService<ProjectRepository, ProjectMapper, ProjectValidator>
        implements ProjectService{

    private final ProjectValidator validator;

    @Autowired
    protected ProjectServiceImpl(ProjectRepository repository, @Qualifier(value = "projectMapper") ProjectMapper mapper, ProjectValidator validator) {
        super(repository, mapper, validator);
        this.validator = validator;
    }

    @Override
    public Long create(ProjectCreateDto createDto) {
        Project project = mapper.fromCreateDto(createDto);
        repository.save(project);
        return project.getId();
    }

    @Override
    public Void delete(Long id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public Void update(ProjectUpdateDto updateDto) {
        Project project = mapper.fromUpdateDto(updateDto);
        repository.save(project);
        return null;
    }

    @Override
    public List<ProjectDto> getAll(GenericCriteria criteria) {
        return mapper.toDto(repository.findAll());
    }

    @Override
    public ProjectDto get(Long id) {
        Project project = repository.findById(id).orElseThrow(() -> new RuntimeException("Project was not found"));
        return mapper.toDto(project);
    }

    @Override
    public Long totalCount(GenericCriteria criteria) {
        return null;
    }

    @Override
    @Query(value = "update Project p set p.archived = true where p.id = :id")
    public Void archive(@Param("id") Long id) {
        return null;
    }

    @Override
    @Query(value = "update Project p set p.archived = false where p.id = :id")
    public Void unarchive(@Param("id") Long id) {
        return null;
    }

    @Override
    @Query(value = "update Project p set p.closed = true where p.id = :id")
    public Void close(@Param("id") Long id) {
        return null;
    }

}
