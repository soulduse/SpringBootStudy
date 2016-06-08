package net.soul.sp.domain.validator;

import net.soul.sp.service.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Created by sould on 2016-06-08.
 */
@Component
public class MemberCreateFormValidator implements Validator {

    private static final Logger LOG = LoggerFactory.getLogger(MemberCreateFormValidator.class);
    private final MemberService memberService;

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
