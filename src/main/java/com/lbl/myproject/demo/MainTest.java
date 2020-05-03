package com.lbl.myproject.demo;

import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.util.PatternMatchUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @author: BaoLei Li
 * @date: 2020/3/21
 **/
public class MainTest {

    private static final String[] DEFAULT_REFERER_REGULARS = { "*.kooup.com", "*.koolearn.com", "*.koo.cn",
            "*.donut.cn", "*.koolearn-inc.com" };

    public static void main(String[] args) {
        // 111
        // 222
//        String origin = "";
//        String referer = "https://s.neibu.kooup.com/pcapp/mycourses";
//        try {
//            URI uri = new URI(referer);
//            if (PatternMatchUtils.simpleMatch(DEFAULT_REFERER_REGULARS, uri.getHost())) {
//                StringBuilder originStringBuilder = new StringBuilder(uri.getScheme()).append("://")
//                        .append(uri.getHost());
//                if (uri.getPort() > 0) {
//                    originStringBuilder.append(":").append(uri.getPort());
//                }
//                origin = originStringBuilder.toString();
//            }
//        }
//        catch (Throwable t) {
//        }
//        System.out.println(origin);
        Map<Object, Object> objectObjectMap = Collections.emptyMap();
        objectObjectMap.put(1,1);
        System.out.println(objectObjectMap);


    }
}
