package net.soul.sp;

import net.soul.sp.domain.Member;
import net.soul.sp.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;

/**
 * Created by sould on 2016-04-26.
 */

@EnableAutoConfiguration
@Component
public class App implements CommandLineRunner {

    @Autowired
    MemberRepository memberRepository;

    @Override
    public void run(String... args) throws Exception {
        Member create = memberRepository.save(new Member(null, "soul@koolsign.net", "1234","Kim", "20160426"));
    }
}

