package pl.pjatk;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop(150, 43);
        shop.setPrice(130);
        shop.setSize(43);
        System.out.println(shop.getPriceSneakers());
        Sandals sandals = new Sandals(42,130,"adidos","red");
        sandals.pack();
        HighBoots highBoots = new HighBoots(44,122,"best","brown");
        highBoots.pack();
        Customer michal = new Customer("Michal",150);

        Validator validator = Validation.buildDefaultValidatorFactory ().getValidator ();
        Set<ConstraintViolation<Sandals>> validate = validator.validate (sandals);
        System.out.println (validate);

        Validator validator4 = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<SandalsSizeValidator>> validate4 = validator4.validate(Sandals);
        System.out.println(validate4);


        //Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        //Set<ConstraintViolation<Shop>> validate = validator.validate(shop);
        //System.out.println(validate);
        //Validator validator2 = Validation.buildDefaultValidatorFactory().getValidator();
        //Set<ConstraintViolation<Shop>> validate2 = validator.validate(shop);
        //System.out.println(validate2);
    }

}
