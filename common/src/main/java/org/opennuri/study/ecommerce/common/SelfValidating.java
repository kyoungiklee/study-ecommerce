package org.opennuri.study.ecommerce.common;

import java.util.Set;


public abstract class SelfValidating<T> {
    private final Validator validator;

    public SelfValidating() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    protected void validateSelf() {
        Set<ConstraintViolation<T>> violations = validator.validate((T) this);
        if(!violations.isEmpty()) {
            throw new ConstraintViolationException(violations);
        }
    }
}
