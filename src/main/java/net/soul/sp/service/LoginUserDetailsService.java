package net.soul.sp.service;

import net.soul.sp.domain.User;
import net.soul.sp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by sould on 2016-06-02.
 */
@Service
public class LoginUserDetailsService implements UserDetailsService{
    @Autowired
    UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findOne(username);
        if(user == null){
            throw new UsernameNotFoundException("The requested user is not found.");
        }
        return new LoginUserDetails(user);
    }
}
