package pl.pjatk;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.OverridesAttribute;

public class SandalsSizeValidator implements ConstraintValidator<SandalsSize, Integer>  {
    @Override
    public void initialize(SandalsSize constraintAnnotation) {

    }
    @Override
    public boolean isValid(Integer size, ConstraintValidatorContext ConstraintValidatorcontext) {
        System.out.println("sprawdzam czy dziala");
        return size <= 42;
    }

}
