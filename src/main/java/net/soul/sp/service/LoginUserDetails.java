package net.soul.sp.service;

import net.soul.sp.domain.User;
import org.springframework.security.core.authority.AuthorityUtils;

/**
 * Created by sould on 2016-06-02.
 */
public class LoginUserDetails extends org.springframework.security.core.userdetails.User {
    private final User user;

    public LoginUserDetails(User user) {
        super(
                user.getEmail(),
                user.getEncodedPassword(),
                AuthorityUtils.createAuthorityList("ROLE_USER")
        );

        this.user = user;
    }


    public User getUser() {
        return user;
    }
}
