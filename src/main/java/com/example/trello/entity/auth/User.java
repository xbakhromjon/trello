package com.example.trello.entity.auth;

import com.example.trello.entity.Auditable;
import com.example.trello.entity.organization.Organization;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User extends Auditable {
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    // Todo Think....
    @OneToOne
    @JoinColumn(name = "role_id")
    private Role role;
    private String profilePath;
    private boolean isSuper;
    @ManyToOne
    private Organization organization;

    @Convert(disableConversion = true)
    @Column(name = "created_at")
    private Instant createdAt;
    @Column(name = "created_by")
    private Long createdBy;
    @Convert(disableConversion = true)
    @Column(name = "updated_at")
    private Instant updatedAt;
    @Column(name = "updated_by")
    private Long updatedBy;
}
