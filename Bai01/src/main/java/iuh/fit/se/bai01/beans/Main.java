package iuh.fit.se.bai01.beans;

import iuh.fit.se.bai01.beans.xmlbased.Class_;
import iuh.fit.se.bai01.beans.xmlbased.Person;
import iuh.fit.se.bai01.beans.xmlbased.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    private static ApplicationContext context;

    public static void main(String[] args) {
//        context = new ClassPathXmlApplicationContext("beans.xml");
//        Student student1 = context.getBean("student1", Student.class);
//        System.out.println(student1);

//        context = new ClassPathXmlApplicationContext("beans.xml");
//        Student student2 = context.getBean("student2", Student.class);
//        System.out.println(student2);

//        context = new ClassPathXmlApplicationContext("beans.xml");
//        Student student3 = context.getBean("student3", Student.class);
//        System.out.println(student3);

//        context = new ClassPathXmlApplicationContext("beans.xml");
//        Person person = context.getBean("person", Person.class);
//        System.out.println(person);

        context = new ClassPathXmlApplicationContext("beans.xml");
        Class_ class2 = context.getBean("class2", Class_.class);
        System.out.println(class2);
    }
}
