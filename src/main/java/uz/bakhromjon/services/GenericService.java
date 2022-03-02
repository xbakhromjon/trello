package uz.bakhromjon.services;

import uz.bakhromjon.criteria.GenericCriteria;
import uz.bakhromjon.dto.GenericDto;

import java.io.Serializable;
import java.util.List;

public interface GenericService <
        D extends GenericDto,
        C extends GenericCriteria,
        K extends Serializable > {

    List<D> getAll(C criteria);

    D get (K id);

    Long totalCount (C criteria);

    default Void block (K id) {
        return null;
    }

    default Void unblock (K id) {
        return null;
    }

    default Void archive (K id) {
        return null;
    }

    default Void unarchive (K id) {
        return null;
    }

    default Void close (K id) {
        return null;
    }

    default List<D> getAllById(K id) {
        return null;
    }
}
