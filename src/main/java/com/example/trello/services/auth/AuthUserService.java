package com.example.trello.services.auth;

import com.example.trello.criteria.GenericCriteria;
import com.example.trello.dto.auth.UserCreateDto;
import com.example.trello.dto.auth.UserDto;
import com.example.trello.dto.auth.UserUpdateDto;
import com.example.trello.entity.auth.AuthUser;
import com.example.trello.services.BaseService;
import com.example.trello.services.GenericCrudService;

public interface AuthUserService extends GenericCrudService<
        AuthUser,
        UserDto,
        UserCreateDto,
        UserUpdateDto,
        GenericCriteria,
        Long>,
        BaseService {

}
