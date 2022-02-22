package com.example.trello.entity.auth;

import com.example.trello.entity.Auditable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Permission extends Auditable {
    @Column(nullable = false, unique = true)
    private String code;

    @Column(nullable = false)
    private String name;
}
