package net.soul.sp.config;

import net.spring.soul.dao.IMemberDao;
import net.spring.soul.dao.MemberDao;
import org.apache.commons.dbcp.BasicDataSource;
import org.aspectj.weaver.Member;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * Created by sould on 2016-04-18.
 */
@Configuration
@EnableTransactionManagement
public class AppConfig {
    @Bean
    public IMemberDao memberDao(){
        return new MemberDao();
    }

    @Bean
    public HibernateTemplate hibernateTemplate(){
        return new HibernateTemplate(sessionFactory());
    }
    @Bean
    public SessionFactory sessionFactory() {
        return new LocalSessionFactoryBuilder(getDataSource())
                .addAnnotatedClasses(Member.class)
                .buildSessionFactory();
    }
    @Bean
    public DataSource getDataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/concretepage");
        dataSource.setUsername("root");
        dataSource.setPassword("master");

        return dataSource;
    }
    @Bean
    public HibernateTransactionManager hibTransMan(){
        return new HibernateTransactionManager(sessionFactory());
    }
}
