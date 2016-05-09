package net.soul.sp.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by sould on 2016-04-18.
 */
@Entity                     // Entity 애너테이션을 붙여 JPA 엔티티임을 표시한다.
public class Member {

    @Id
    @GeneratedValue         // DB가 기본키 번호를 자동으로 매기도록 함.
    private long idx;
    private String email;
    private String password;
    private String name;
    @Column(name="reg_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date regDate;

    public Member(){
    }

    public Member(String email, String password, String name){
        this.email      = email;
        this.password   = password;
        this.name       = name;
    }

    public long getIdx() {
        return idx;
    }

    public void setIdx(long idx) {
        this.idx = idx;
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

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public String toString(){
        return String.format("Member[idx=%d, email='%s', password='%s', name='%s', date='%s'",
                idx, email, password, name, regDate);
    }
}
