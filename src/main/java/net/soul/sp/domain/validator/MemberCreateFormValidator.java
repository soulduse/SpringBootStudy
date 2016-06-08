package net.soul.sp.domain.validator;

import net.soul.sp.domain.MemberCreateForm;
import net.soul.sp.service.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Created by sould on 2016-06-08.
 */
@Component
public class MemberCreateFormValidator implements Validator {

    private static final Logger LOGGER = LoggerFactory.getLogger(MemberCreateFormValidator.class);

    @Autowired
    private MemberService memberService;

    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.equals(MemberCreateForm.class);
    }

    @Override
    public void validate(Object target, Errors errors) {
        LOGGER.debug("Validating {}", target);
        MemberCreateForm form = (MemberCreateForm)target;
        validatePasswords(errors, form);
        validateEmail(errors, form);
    }

    private void validatePasswords(Errors errors, MemberCreateForm form) {
        if (!form.getPassword().equals(form.getPasswordRepeated())) {
            errors.reject("password.no_match", "Passwords do not match");
        }
    }

    private void validateEmail(Errors errors, MemberCreateForm form) {
        if (memberService.getUserByEmail(form.getEmail()).isPresent()) {
            errors.reject("email.exists", "User with this email already exists");
        }
    }
}
