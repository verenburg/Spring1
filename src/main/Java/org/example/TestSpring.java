package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        TestBean testBean = context.getBean("testBean", TestBean.class);  // в поле name указываем id бина из файла applicationContext.xml,
                                                                                // во втором аргументе класс объект которого мы хотим получить в качестве бина
        System.out.println(testBean.getName());

        context.close();
    }
}
