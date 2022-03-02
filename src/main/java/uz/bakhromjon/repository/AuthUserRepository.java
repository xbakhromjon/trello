package uz.bakhromjon.repository;

import uz.bakhromjon.entity.auth.AuthUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthUserRepository extends JpaRepository<AuthUser,Long>,AbstractRepository {

    AuthUser findAuthUserByFirstName(String name);
}
