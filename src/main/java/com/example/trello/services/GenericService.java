package com.example.trello.services;

import com.example.trello.criteria.GenericCriteria;
import com.example.trello.dto.GenericDto;

import java.io.Serializable;
import java.util.List;

public interface GenericService <
        D extends GenericDto,
        C extends GenericCriteria,
        K extends Serializable > {

    List<D> getAll(C criteria);

    D get (K id);

    Long totalCount (C criteria);

    Void block (K id);

    Void unblock(K id);
}
