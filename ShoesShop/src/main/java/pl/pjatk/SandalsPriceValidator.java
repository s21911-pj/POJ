package pl.pjatk;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class SandalsPriceValidator implements ConstraintValidator<SandalsPrice, Integer> {
    @Override
    public void initialize(SandalsPrice constraintAnnotation) {

    }
    @Override
    public boolean isValid(Integer price, ConstraintValidatorContext context) {
        System.out.println("o cho nie wiem co");
        return price >= 150;
    }
}
