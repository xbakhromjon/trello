package com.example.trello.entity.organization;

import com.example.trello.entity.Auditable;
import com.example.trello.entity.auth.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Organization extends Auditable {

    @Column(nullable = false,length = 20)
    private String name;
    private String logo;
    private String email;
    @Column(unique = true,nullable = false)
    private String code;
    private String location;
    private String owner;
    private boolean blocked;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="organization_id")
    private List<User> users;

}
