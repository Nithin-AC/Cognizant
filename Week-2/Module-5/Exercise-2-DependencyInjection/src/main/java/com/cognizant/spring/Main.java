package com.cognizant.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        CountryService service =
                context.getBean("countryService", CountryService.class);

        service.displayCountry();
    }
}