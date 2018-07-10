package com.kyle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication springboot应用标记在某个类上说明这个类是springboot的主配置类，springboot就应该运行这个类的main方法来启动springboot应用。
 * @SpringBootConfiguration springboot的配置类，标注在某个类上，表示这是一个springboot的配置类。
 * @Configuration 配置类上来标注这个注解。配置类也是容器的一个组件；@Component
 * @EnableAutoConfiguration 开启自动配置功能。
 * @AutoConfigurationPackage 自动配置包。
 */
@SpringBootApplication
public class App {

    public static void main(String[] args) {

        //Spring应用启动起来
        SpringApplication.run(App.class);
    }
}
