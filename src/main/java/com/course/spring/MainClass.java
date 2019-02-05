package com.course.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.InputStream;
import java.util.Properties;

public class MainClass {

    public static void main(String[] args) {

       ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
       Print printer = context.getBean(Print.class);
       String text = null;
       int firstNumber = 0;
       int secondNumber = 0;
       Properties properties = new Properties();
       try(InputStream inputStream = MainClass.class.getClassLoader().getResourceAsStream("parametrs.properties")) {
           properties.load(inputStream);
           text = properties.getProperty("text");
           firstNumber = Integer.parseInt(properties.getProperty("number1"));
           secondNumber = Integer.parseInt(properties.getProperty("number2"));
       } catch (Exception e) {
           e.printStackTrace();
       }
       printer.printText(text);
       printer.printSum(firstNumber, secondNumber);

    }


}
