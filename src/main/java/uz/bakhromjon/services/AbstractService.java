package uz.bakhromjon.services;

import uz.bakhromjon.mapper.Mapper;
import uz.bakhromjon.repository.AbstractRepository;
import uz.bakhromjon.utils.validators.Validator;

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
