package task_33;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Hello hello = (Hello) context.getBean("hello");
        hello.getHelloMessage();
    }
}