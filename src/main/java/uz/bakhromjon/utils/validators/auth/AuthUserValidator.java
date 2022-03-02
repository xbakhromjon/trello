package uz.bakhromjon.utils.validators.auth;

import uz.bakhromjon.dto.auth.UserCreateDto;
import uz.bakhromjon.dto.auth.UserUpdateDto;
import uz.bakhromjon.exception.ValidationException;
import uz.bakhromjon.utils.BaseUtils;
import uz.bakhromjon.utils.validators.AbstractValidator;
import org.springframework.stereotype.Component;


@Component
public class AuthUserValidator extends AbstractValidator<UserCreateDto, UserUpdateDto,Long> {
    protected AuthUserValidator(BaseUtils baseUtils) {
        super(baseUtils);
    }

    @Override
    public void validateKey(Long id) throws ValidationException {

    }

    @Override
    public void validOnCreate(UserCreateDto userCreateDto) throws ValidationException {

    }

    @Override
    public void validOnUpdate(UserUpdateDto cd) throws ValidationException {

    }
}
