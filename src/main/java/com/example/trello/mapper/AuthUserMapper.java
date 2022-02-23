package com.example.trello.mapper;

import com.example.trello.dto.auth.UserCreateDto;
import com.example.trello.dto.auth.UserDto;
import com.example.trello.dto.auth.UserUpdateDto;
import com.example.trello.entity.auth.AuthUser;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface AuthUserMapper extends BaseMapper <
        AuthUser,
        UserDto,
        UserCreateDto,
        UserUpdateDto> {
    @Override
    UserDto toDto(AuthUser authUser);

    @Override
    List<UserDto> toDto(List<AuthUser> e);

    @Override
    AuthUser fromCreateDto(UserCreateDto userCreateDto);

    @Override
    AuthUser fromUpdateDto(UserUpdateDto d);
}
