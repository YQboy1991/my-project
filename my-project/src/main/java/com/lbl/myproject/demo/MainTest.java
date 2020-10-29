package com.lbl.myproject.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: BaoLei Li
 * @date: 2020/3/21
 **/
public class MainTest {

    private static final Pattern VERSION_PATTERN = Pattern.compile("^\\/(?!swagger|webjar|v2\\/api-docs)[^.]+(?!\\.jsp)(\\.?\\w+)?(\\?\\w+)?$", Pattern.CASE_INSENSITIVE);


    public static void main(String[] args) throws Exception {
        Matcher matcher = VERSION_PATTERN.matcher("/k12/student/monitor/health.jsp");
        boolean b = matcher.find();
        System.out.println(b);
        boolean matches = matcher.matches();
        System.out.println(matches);


    }
}
