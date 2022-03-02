package uz.bakhromjon.mapper;

import uz.bakhromjon.dto.project.ProjectCreateDto;
import uz.bakhromjon.dto.project.ProjectDto;
import uz.bakhromjon.dto.project.ProjectUpdateDto;
import uz.bakhromjon.entity.project.Project;
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
