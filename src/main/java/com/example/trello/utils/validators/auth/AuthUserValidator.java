package com.example.trello.utils.validators.auth;

import com.example.trello.dto.auth.UserCreateDto;
import com.example.trello.dto.auth.UserUpdateDto;
import com.example.trello.exception.ValidationException;
import com.example.trello.utils.BaseUtils;
import com.example.trello.utils.validators.AbstractValidator;
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
