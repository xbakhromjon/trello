package uz.bakhromjon.configs.security;

import uz.bakhromjon.entity.auth.AuthUser;
import uz.bakhromjon.repository.AuthUserRepository;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class ApplicationUserDetailsService implements UserDetailsService {

    private final AuthUserRepository authUserRepository;

    public ApplicationUserDetailsService(AuthUserRepository authUserRepository) {
        this.authUserRepository = authUserRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AuthUser user = authUserRepository.findAuthUserByFirstName(username);
        if (user == null) {
            throw new UsernameNotFoundException("User was not found");
        }
        return new UserDetails(user);
    }
}
