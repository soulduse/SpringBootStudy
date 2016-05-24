package net.soul.sp.domain;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

import javax.persistence.*;

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
    private DateTime regDate;
    private DateTime updDate;

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
        return String.format("Member[idx=%d, email='%s', password='%s', name='%s', date='%s'",
                idx, email, password, name, regDate);
    }
}
