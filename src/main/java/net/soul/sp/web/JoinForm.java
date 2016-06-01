package net.soul.sp.web;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by sould on 2016-05-28.
 */
public class JoinForm {
    @NotNull
    @Size(min=4, max=30)
    private String name;
    @NotNull
    @Size(min=6, max=30)
    private String email;
    @NotNull
    @Size(min=6, max=30)
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
