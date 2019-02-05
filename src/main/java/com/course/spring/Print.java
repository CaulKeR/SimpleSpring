package com.course.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Print {

    @Autowired private Calculate calculator;

    public void printText(String text) {
        System.out.println(text);
    }

    public void printSum(int a, int b) {
        System.out.println(calculator.getSum(a, b));
    }

}
