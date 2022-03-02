package uz.bakhromjon.services.auth;


import uz.bakhromjon.criteria.GenericCriteria;
import uz.bakhromjon.dto.auth.UserCreateDto;
import uz.bakhromjon.dto.auth.UserDto;
import uz.bakhromjon.dto.auth.UserUpdateDto;
import uz.bakhromjon.mapper.AuthUserMapper;
import uz.bakhromjon.repository.AuthUserRepository;
import uz.bakhromjon.services.AbstractService;
import uz.bakhromjon.utils.validators.auth.AuthUserValidator;
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
