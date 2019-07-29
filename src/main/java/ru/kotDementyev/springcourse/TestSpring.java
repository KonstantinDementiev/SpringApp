package ru.kotDementyev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        TestBean testBeanObj = context.getBean("testBean", TestBean.class);

        System.out.println(testBeanObj.getName());

        context.close();
    }
}
