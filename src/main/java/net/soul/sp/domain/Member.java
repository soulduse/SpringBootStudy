package net.soul.sp.domain;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by sould on 2016-04-18.
 */
@Entity                     // Entity 애너테이션을 붙여 JPA 엔티티임을 표시한다.
//@Table(name = "member")     // 엔티티에 대응하는 테이블 이름을 지정한다.
//@Data
//@NoArgsConstructor          // JPA 명세에 따르면 엔티티 클래스는 인자를 받지 않는 기본 생성자를 만들어야 한다. 롬북으로 기본 생성자를 만들때 사용
//@AllArgsConstructor         // JPA와는 관계 없지만, 롬북이 기본 생성자 외에 전체 필드를 인자로 받는 생성자를 만들도록 설정.
public class Member {

    @Id
    @GeneratedValue         // DB가 기본키 번호를 자동으로 매기도록 함.
//    @Column(name = "idx")
    private int id;
//    @Column(name = "email")
    private String email;
//    @Column(name = "password")
    private String password;
//    @Column(name = "name")
    private String name;
//    @Column(name = "reg_date")
    private Date regDate;

    public Member(){
    }

    public Member(String email, String password, String name){
        this.email      = email;
        this.password   = password;
        this.name       = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }
}
