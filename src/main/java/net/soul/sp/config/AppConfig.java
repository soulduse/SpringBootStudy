package net.soul.sp.config;

import net.soul.sp.repository.IMemberDao;
import net.soul.sp.repository.MemberDao;
import net.soul.sp.domain.Member;
import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * Created by sould on 2016-04-18.
 */
@Configuration
@ComponentScan
@EnableTransactionManagement
public class AppConfig {
    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @Value("${spring.datasource.url}")
    private String driver;

    @Value("${spring.datasource.dataSourceClassName}")
    private String url;


}


/*
    private static final String HOME_DATABASE = "192.168.206.128";
    private static final String COMPANY_DATABASE = "172.16.135.7";

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
        dataSource.setUrl("jdbc:mysql://"+HOME_DATABASE+"/spring4");
        dataSource.setUsername("root");
        dataSource.setPassword("1234");

        return dataSource;
    }
    @Bean
    public HibernateTransactionManager hibTransMan(){
        return new HibernateTransactionManager(sessionFactory());
    }

    */