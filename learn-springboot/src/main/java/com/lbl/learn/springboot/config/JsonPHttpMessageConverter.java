package com.lbl.learn.springboot.config;

import com.fasterxml.jackson.core.JsonGenerator;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author: BaoLei Li
 * @date: 2021/9/3
 **/
@Data
public class JsonPHttpMessageConverter extends MappingJackson2HttpMessageConverter {

    private String jsonPrefix;

    private String jsonpFunction;

    @Override
    protected void writePrefix(JsonGenerator generator, Object object) throws IOException {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
        String callback = request.getParameter("callback");
        if (StringUtils.isNotBlank(callback)) {
            generator.writeRaw(callback + "(");
        }
    }

    @Override
    protected void writeSuffix(JsonGenerator generator, Object object) throws IOException {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
        String callback = request.getParameter("callback");
        if (StringUtils.isNotBlank(callback)) {
            generator.writeRaw(")");
        }
    }
}
