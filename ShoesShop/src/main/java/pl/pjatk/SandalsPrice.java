package pl.pjatk;

import javax.validation.Payload;

public @interface SandalsPrice {
public int price() default  150;
String message() default "Wrong price";
Class<?>[] groups() default {};
Class<? extends Payload>[] payload() default {};
}
