package edu.spring.boot.firstboot.core;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


/**
 * @Configuration помечает класс как источник определения бинов для контекста приложения
 * @EnableAutoConfiguration говорит Spring Boot о запуске добавления бинов в соответствии с содержанием
 * classpath и других бинов, а также различных параметров настроек (Говорит boot, что это точка входа)
 * @ComponentScan говорит Spring о том, чтобы просмотреть все компоненты, конфигурации и сервисы в пакете hello,
 * сто позволяет ему найти HelloController
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "edu.spring.boot.firstboot.controller")
public class Application {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        System.out.println("\n\nLet's inspect the beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }
}
