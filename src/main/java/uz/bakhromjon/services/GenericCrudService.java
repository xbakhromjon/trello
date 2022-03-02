package uz.bakhromjon.services;

import uz.bakhromjon.criteria.GenericCriteria;
import uz.bakhromjon.dto.Dto;
import uz.bakhromjon.dto.GenericDto;
import uz.bakhromjon.entity.BaseEntity;

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
