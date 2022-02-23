package com.example.trello.services.auth;


import com.example.trello.criteria.GenericCriteria;
import com.example.trello.dto.auth.UserCreateDto;
import com.example.trello.dto.auth.UserDto;
import com.example.trello.dto.auth.UserUpdateDto;
import com.example.trello.mapper.AuthUserMapper;
import com.example.trello.repository.AuthUserRepository;
import com.example.trello.services.AbstractService;
import com.example.trello.utils.validators.auth.AuthUserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthUserServiceImpl extends AbstractService<AuthUserRepository, AuthUserMapper, AuthUserValidator> implements AuthUserService {

    @Autowired
    public AuthUserServiceImpl(AuthUserRepository repository, @Qualifier("authUserMapper") AuthUserMapper mapper, AuthUserValidator validator) {
        super(repository, mapper, validator);
    }

    @Override
    public Long create(UserCreateDto createDto) {
        return null;
    }

    @Override
    public Void update(UserUpdateDto updateDto) {
        return null;
    }

    @Override
    public Void delete(Long id) {
        return null;
    }

    @Override
    public List<UserDto> getAll(GenericCriteria criteria) {
        return null;
    }

    @Override
    public UserDto get(Long id) {
        return null;
    }

    @Override
    public Long totalCount(GenericCriteria criteria) {
        return null;
    }
}
