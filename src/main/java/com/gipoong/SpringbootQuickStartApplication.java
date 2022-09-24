package com.gipoong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.gipoong", "com.ruby"})
public class SpringbootQuickStartApplication {

    public static void main(String[] args) {
        // SpringApplication.run(SpringbootQuickStartApplication.class, args);

        // 일반 자바 애플리케이션으로 실행
        SpringApplication application =
                new SpringApplication(SpringbootQuickStartApplication.class);

        // WebApplication Type Setting
        //application.setWebApplicationType(WebApplicationType.SERVLET);

        // 배너 OFF
        //application.setBannerMode(Banner.Mode.OFF);

        application.run(args);
    }

}
