package net.soul.sp.data;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by sould on 2016-04-11.
 */
public class MemberDao {

    private JdbcTemplate jdbcTemplate;

    public MemberDao(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public Member selectByEmail(String email){
        List<Member> results = jdbcTemplate.query(
                "select * from MEMBER where EMAIL = ?",
                new MemberRowMapper(), email
        );

        return results.isEmpty() ? null : results.get(0);
    }
    public void insert(Member member){

    }

    // update code
    public void update(Member member){
        jdbcTemplate.update(
                "update MEMBER set NAME=?, PASSWORD=? where EMAIL=?",
                member.getName(), member.getPassword(), member.getEmail());
    }

    public List<Member> selectAll(){
        List<Member> results = jdbcTemplate.query(
                "select * from MEMBER",
                new MemberRowMapper());

        return results;
    }

    public int count(){
        Integer count = jdbcTemplate.queryForObject(
                "select count(*) from MEMBER", Integer.class
        );
        return count;
    }



}
