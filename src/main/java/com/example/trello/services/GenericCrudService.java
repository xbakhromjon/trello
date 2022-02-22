package com.example.trello.services;

import com.example.trello.criteria.GenericCriteria;
import com.example.trello.dto.Dto;
import com.example.trello.dto.GenericDto;
import com.example.trello.entity.BaseEntity;

import java.io.Serializable;

public interface GenericCrudService <
        E extends BaseEntity,
        D extends GenericDto,
        CD extends Dto,
        UD extends GenericDto,
        C extends GenericCriteria,
        K extends Serializable > extends GenericService<D,C,K>{

    K create(CD createDto);
    Void update(UD updateDto);
    Void delete(K id);


}
