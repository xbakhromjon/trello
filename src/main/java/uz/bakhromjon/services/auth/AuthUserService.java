package uz.bakhromjon.services.auth;

import uz.bakhromjon.criteria.GenericCriteria;
import uz.bakhromjon.dto.auth.UserCreateDto;
import uz.bakhromjon.dto.auth.UserDto;
import uz.bakhromjon.dto.auth.UserUpdateDto;
import uz.bakhromjon.entity.auth.AuthUser;
import uz.bakhromjon.services.BaseService;
import uz.bakhromjon.services.GenericCrudService;

public interface AuthUserService extends GenericCrudService<
        AuthUser,
        UserDto,
        UserCreateDto,
        UserUpdateDto,
        GenericCriteria,
        Long>,
        BaseService {

}
