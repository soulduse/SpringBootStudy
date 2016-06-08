package net.soul.sp.domain;

import org.joda.time.DateTime;

import javax.persistence.*;

/**
 * Created by sould on 2016-04-18.
 */
@Entity                     // Entity 애너테이션을 붙여 JPA 엔티티임을 표시한다.
public class Member {

    @Id
    @GeneratedValue         // DB가 기본키 번호를 자동으로 매기도록 함.
    private long id;
    @Column(name = "email", length = 50, nullable = false, unique = true)
    private String email;
    @Column(name = "password", length = 20, nullable = false)
    private String password;
    @Column(name = "name", length = 30, nullable = false)
    private String name;
    @Column(name = "role", nullable = false)
    @Enumerated(EnumType.STRING)
    private Role role;
    @Column(name = "reg_date")
    private DateTime regDate;
    @Column(name = "upd_date")
    private DateTime updDate;

    public Member(){
    }

    public Member(String email, String password, String name){
        this.email      = email;
        this.password   = password;
        this.name       = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public DateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(DateTime regDate) {
        this.regDate = regDate;
    }

    public DateTime getUpdDate() {
        return updDate;
    }

    public void setUpdDate(DateTime updDate) {
        this.updDate = updDate;
    }

    public String toString(){
        return String.format("Member[id=%d, email='%s', password='%s', name='%s', date='%s'",
                id, email, password, name, regDate);
    }
}
