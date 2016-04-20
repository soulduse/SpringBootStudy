package net.soul.sp;

import net.soul.sp.config.AppConfig;
import net.soul.sp.dao.IMemberDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by sould on 2016-04-20.
 */
public class SpringHibernateTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new
                AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        IMemberDao dao = ctx.getBean(IMemberDao.class);
        dao.saveMember();
        System.out.println("Save OK...");

        ctx.close();
    }
}
