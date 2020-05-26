package pl.pjatk;

import javax.validation.Payload;
import java.lang.annotation.Annotation;

public class SneakersSizePriceValidator implements SneakersSizePrice {//dlaczego każe mi wszystkie metody implementować?
    public int size() {
        return 0;
    }

    public int price() {
        return 0;
    }

    public String message() {
        return null;
    }

    public Class<?>[] groups() {
        return new Class[0];
    }

    public Class<? extends Payload>[] payload() {
        return new Class[0];
    }

    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
