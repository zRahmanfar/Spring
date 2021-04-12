package com.example.demo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component("seivics")
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Seivics implements InitializingBean {

    private SimpleDateFormat simpleDateFormat;
   // @Autowired
    public void setSimpleDateFormat(SimpleDateFormat simpleDateFormat){
        this.simpleDateFormat= simpleDateFormat;
    }

    public Seivics() {  System.out.println("run constructor (Creat Seivics)....."); }
    @PostConstruct
    public void prCons(){ System.out.println("run after constructor (Initializd Seivics) ...."); }
    @PreDestroy
    public  void dstory(){ System.out.println("run destory Seivics...."); }

    public  void doSomthing(){ System.out.println("Salam Name Class " + this.getClass().getName()); }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("run afterPropertiesSet Seivics....");
    }

    public Date parsDate(String date){
      try {
          return simpleDateFormat.parse(date);
      } catch (ParseException e) {
         throw new IllegalArgumentException(e);
      }
    }
}


