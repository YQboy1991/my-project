package com.lbl.learn.springboot.controller;

import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.error.DefaultErrorViewResolver;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * @author: BaoLei Li
 * @date: 2021/9/10
 **/
@Controller
@RequestMapping("/api/static")
public class StaticController {

    @Autowired
    private ApplicationContext applicationContext;

    @RequestMapping(value = "get",
            produces = {"text/html"}
    )
    public ModelAndView errorHtml(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Resource resource = this.applicationContext.getResource("classpath:/public/");
        resource = resource.createRelative("hello_pub" + ".html");
        return new ModelAndView(new HtmlResourceView(resource), Maps.<String, Object>newHashMap());
    }

    private static class HtmlResourceView implements View {
        private Resource resource;

        HtmlResourceView(Resource resource) {
            this.resource = resource;
        }

        @Override
        public String getContentType() {
            return "text/html";
        }

        @Override
        public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
            response.setContentType(this.getContentType());
            FileCopyUtils.copy(this.resource.getInputStream(), response.getOutputStream());
        }
    }
}
