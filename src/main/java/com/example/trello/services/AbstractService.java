package com.example.trello.services;

import com.example.trello.mapper.Mapper;
import com.example.trello.repository.AbstractRepository;
import com.example.trello.utils.validators.Validator;

public abstract class AbstractService <
        R extends AbstractRepository,
        M extends Mapper,
        V extends Validator> {
    protected final R repository;
    protected final M mapper;
    protected final V Validator;

    public AbstractService(R repository, M mapper, V validator) {
        this.repository = repository;
        this.mapper = mapper;
        Validator = validator;
    }
}
