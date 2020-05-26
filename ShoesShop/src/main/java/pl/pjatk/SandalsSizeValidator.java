package pl.pjatk;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class SandalsSizeValidator implements ConstraintValidator<SandalsSize, Integer>  {
    public void initialize(SandalsSize constraintAnnotation) {

    }

    public boolean isValid(Integer size, ConstraintValidatorContext context) {
        return size <= 42;
    }

}
