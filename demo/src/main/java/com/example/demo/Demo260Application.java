package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo260Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context=SpringApplication.run(Demo260Application.class);
       // Seivics seivics=context.getBean(Seivics.class);
        Seivics seivics=(Seivics)context.getBean("seivics");
        Seivics seivics2=(Seivics)context.getBean("seivics");
        seivics.doSomthing();
        System.out.println( seivics.parsDate("1399/12/02"));
        //SCOPE_PROTOTYPE
        System.out.println("***************>>"+seivics);
        System.out.println("***************>>"+seivics2);

        Servicetwo servicetwo= (Servicetwo) context.getBean("servicetwo");
        servicetwo.doSomthing();

    }

}
