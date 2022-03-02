package uz.bakhromjon.utils.validators;

import uz.bakhromjon.exception.ValidationException;
import uz.bakhromjon.utils.BaseUtils;

public abstract class AbstractValidator<CD, UD, K> implements Validator {

    protected final BaseUtils baseUtils;

    protected AbstractValidator(BaseUtils baseUtils) {
        this.baseUtils = baseUtils;
    }

    public abstract void validateKey(K id) throws ValidationException;

    public abstract void validOnCreate(CD cd) throws ValidationException;

    public abstract void validOnUpdate(UD cd) throws ValidationException;


}
