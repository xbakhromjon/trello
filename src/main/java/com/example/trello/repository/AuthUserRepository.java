package com.example.trello.repository;

import com.example.trello.entity.auth.AuthUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthUserRepository extends JpaRepository<AuthUser,Long>,AbstractRepository {

    AuthUser findAuthUserByFirstName(String name);
}
