package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.SystemEnvironmentPropertySource;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) throws Exception {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        /*Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());

        String s = context.getBean(String.class);
        System.out.println(s);

        Integer n = context.getBean(Integer.class);
        System.out.println(n);
        */
        Parrot x = context.getBean(Parrot.class);
        //x.setName("Kikii");

        Supplier<Parrot> parrotSupplier = () -> x;

        context.registerBean("parrot1",Parrot.class, parrotSupplier, bc -> bc.setPrimary(true));

        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());
    }
}