package com.utils;

import java.util.Date;

public class DateDemo {

    public static void main(String[] args) {
        Date today = new Date();
        int hours = today.getHours();
        System.out.println(today);
        System.out.println(hours);
    }
}
