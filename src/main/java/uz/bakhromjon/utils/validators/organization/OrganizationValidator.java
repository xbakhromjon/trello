package uz.bakhromjon.utils.validators.organization;

import uz.bakhromjon.dto.organization.OrganizationCreateDto;
import uz.bakhromjon.dto.organization.OrganizationUpdateDto;
import uz.bakhromjon.exception.ValidationException;
import uz.bakhromjon.utils.BaseUtils;
import uz.bakhromjon.utils.validators.AbstractValidator;
import uz.bakhromjon.utils.validators.Validator;
import org.springframework.stereotype.Component;

@Component
public class OrganizationValidator extends AbstractValidator<OrganizationCreateDto,OrganizationUpdateDto,Long>
        implements Validator {

    public OrganizationValidator(BaseUtils baseUtils) {
        super(baseUtils);
    }

    @Override
    public void validateKey(Long id) throws ValidationException {

    }

    @Override
    public void validOnCreate(OrganizationCreateDto organizationCreateDto) throws ValidationException {

    }

    @Override
    public void validOnUpdate(OrganizationUpdateDto cd) throws ValidationException {

    }
}
