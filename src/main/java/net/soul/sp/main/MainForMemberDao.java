package net.soul.sp.main;

import net.soul.sp.data.Member;
import net.soul.sp.data.MemberDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

/**
 * Created by sould on 2016-04-14.
 */
public class MainForMemberDao {

    private static MemberDao memberDao;

    public static void main(String[] args) {
        AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCtx.xml");
//        ApplicationContext ctx = new GenericXmlApplicationContext("appCtx.xml");

        memberDao = ctx.getBean("memberDao", MemberDao.class);

        selectAll();
        ctx.close();
    }

    private static void selectAll(){
        System.out.println("------------ selectAll");
        int total = memberDao.count();
        System.out.println("전체 데이터 : "+total);
        List<Member> members = memberDao.selectAll();
        for(Member m : members){
            System.out.println(m.getId()+" : "+m.getEmail()+" : "+m.getName());
        }
    }
}
