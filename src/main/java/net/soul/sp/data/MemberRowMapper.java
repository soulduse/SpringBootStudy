package net.soul.sp.data;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by sould on 2016-04-12.
 */
public class MemberRowMapper implements RowMapper<Member> {

    public Member mapRow(ResultSet rs, int rowNum) throws SQLException{
        Member member = new Member(rs.getString("EMAIL"),
                rs.getString("PASSWORD"),
                rs.getString("NAME"),
                rs.getTimestamp("REGDATE"));
        member.setId(rs.getLong("ID"));
        return member;
    }
}
