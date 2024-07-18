package chap3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        //Person person = context.getBean(Person.class);
        //Parrot parrot = context.getBean(Parrot.class);

        Person p = context.getBean(Person.class);

        System.out.println("사람의 이름 : " + p.getName());
        //System.out.println("앵무의 이름 : " + parrot.getName());
        System.out.println("사람의 앵무새 : " + p.getParrot());
    }
}
