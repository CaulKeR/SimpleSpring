package com.course.spring;

import org.springframework.stereotype.Component;

@Component
public class Calculate {

    public int getSum(int a, int b) {
        return a + b;
    }

}
