package net.soul.sp;

import net.soul.sp.domain.Member;
import net.soul.sp.repository.MemberRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootStudyApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringBootStudyApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStudyApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(MemberRepository repository){
		repository.save(new Member("soul@kool.net", "soul","kim"));
		repository.save(new Member("soul@kool.net", "soul","kim"));
		repository.save(new Member("soul@kool.net", "soul","kim"));
		repository.save(new Member("soul@kool.net", "soul","kim"));


	}
}
