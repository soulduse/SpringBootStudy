package net.soul.sp.service;

import net.soul.sp.domain.User;
import net.soul.sp.domain.UserCreateForm;

import java.util.Collection;
import java.util.Optional;

/**
 * Created by sould on 2016-06-07.
 */
public interface UserService {
    Optional<User> getUserById(long id);

    Optional<User> getUserByEmail(String email);

    Collection<User> getAllUsers();

    User create(UserCreateForm form);
}
