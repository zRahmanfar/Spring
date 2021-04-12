package com.example.demo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Locale;

@Configuration
public class AppConfig {

    @Bean (initMethod = "prCons" ,destroyMethod = "dstory")
    public Servicetwo servicetwo(){
        return new Servicetwo();
    }

    @Bean("simpleDateFormat")
    public SimpleDateFormat simpleParsionDateFormat(){

       SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy/mm/dd",new Locale("fa","IR"));
       return simpleDateFormat;
    }
}

