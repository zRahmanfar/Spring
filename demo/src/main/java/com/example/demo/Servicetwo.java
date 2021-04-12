package com.example.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//without compunent anotation
public class Servicetwo {

    public  void doSomthing(){

        System.out.println("Salam Name Class " + this.getClass().getName());
    }

    @PostConstruct
    public void prCons(){ System.out.println("run after constructor (Initializd Servicetwo) ...."); }
    @PreDestroy
    public  void dstory(){ System.out.println("run destory Servicetwo...."); }

}
