package com.warks.dochelper.dochelper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestDochelperApplication {

    public static void main(String[] args) {
        SpringApplication.from(DochelperApplication::main).with(TestDochelperApplication.class).run(args);
    }

}
