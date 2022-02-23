package com.example.trello.entity.auth;

import com.example.trello.entity.Auditable;
import com.example.trello.entity.organization.Organization;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AuthUser extends Auditable {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String profile;
    private boolean active;
    private boolean blocked;
    private boolean isSuper;

    @ManyToOne
    private Organization organization;

    @OneToOne(mappedBy = "user")
    private Role role;

}
