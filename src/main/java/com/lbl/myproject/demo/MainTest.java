package com.lbl.myproject.demo;

import com.google.common.collect.Lists;
import org.apache.tomcat.util.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.util.PatternMatchUtils;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
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

    public static void main(String[] args) throws Exception {
//        // 111
//        // 222
//        // 333
//        // 444
////        String origin = "";
////        String referer = "https://s.neibu.kooup.com/pcapp/mycourses";
////        try {
////            URI uri = new URI(referer);
////            if (PatternMatchUtils.simpleMatch(DEFAULT_REFERER_REGULARS, uri.getHost())) {
////                StringBuilder originStringBuilder = new StringBuilder(uri.getScheme()).append("://")
////                        .append(uri.getHost());
////                if (uri.getPort() > 0) {
////                    originStringBuilder.append(":").append(uri.getPort());
////                }
////                origin = originStringBuilder.toString();
////            }
////        }
////        catch (Throwable t) {
////        }
////        System.out.println(origin);
//        Map<Object, Object> objectObjectMap = Collections.emptyMap();
//        objectObjectMap.put(1,1);
//        System.out.println(objectObjectMap);

            Long timestamp = System.currentTimeMillis();
        System.out.println(timestamp);
        String secret = "SEC779516606d718af726c3357a3be38292b94c2298d6ccc23adc232c69100a079e";

            String stringToSign = timestamp + "\n" + secret;
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(secret.getBytes("UTF-8"), "HmacSHA256"));
            byte[] signData = mac.doFinal(stringToSign.getBytes("UTF-8"));
            String sign = URLEncoder.encode(new String(Base64.encodeBase64(signData)),"UTF-8");
            System.out.println(sign);



    }
}
