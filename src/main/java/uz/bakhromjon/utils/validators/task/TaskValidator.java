package uz.bakhromjon.utils.validators.task;

import uz.bakhromjon.dto.project.ProjectCreateDto;
import uz.bakhromjon.dto.project.ProjectUpdateDto;
import uz.bakhromjon.exception.ValidationException;
import uz.bakhromjon.utils.BaseUtils;
import uz.bakhromjon.utils.validators.AbstractValidator;
import uz.bakhromjon.utils.validators.Validator;
import org.springframework.stereotype.Component;

@Component
public class TaskValidator  extends AbstractValidator<ProjectCreateDto, ProjectUpdateDto,Long>
        implements Validator {
    protected TaskValidator(BaseUtils baseUtils) {
        super(baseUtils);
    }

    @Override
    public void validateKey(Long id) throws ValidationException {

    }

    @Override
    public void validOnCreate(ProjectCreateDto projectCreateDto) throws ValidationException {

    }

    @Override
    public void validOnUpdate(ProjectUpdateDto cd) throws ValidationException {

    }
}
