package uz.bakhromjon.mapper;

import uz.bakhromjon.dto.auth.UserCreateDto;
import uz.bakhromjon.dto.auth.UserDto;
import uz.bakhromjon.dto.auth.UserUpdateDto;
import uz.bakhromjon.entity.auth.AuthUser;
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
