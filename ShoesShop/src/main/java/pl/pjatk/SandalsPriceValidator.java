package pl.pjatk;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class SandalsPriceValidator implements ConstraintValidator<SandalsPrice, Integer> {

    public void initialize(SandalsPrice constraintAnnotation) {

    }

    public boolean isValid(Integer price, ConstraintValidatorContext context) {
        return price >= 150;
    }
}
