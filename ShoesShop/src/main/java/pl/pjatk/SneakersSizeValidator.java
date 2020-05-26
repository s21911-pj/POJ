package pl.pjatk;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;
import java.lang.annotation.Annotation;

public class SneakersSizeValidator implements ConstraintValidator <SneakersSize, Integer> {
    @Override
    public void initialize(SneakersSize constraintAnnotation) {

    }

    @Override
    public boolean isValid(Integer size, ConstraintValidatorContext context) {
        return size<= 48;
    }

}
