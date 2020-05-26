package pl.pjatk;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = SandalsPriceValidator.class)


    public @interface SneakersSizePrice {
        public int size() default  42;
        public int price() default 150;
        String message() default "Wrong price or size";
        Class<?>[] groups() default {};
        Class<? extends Payload>[] payload() default {};
    }

