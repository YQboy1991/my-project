package com.lbl.learn.springboot.config.propertysupport;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.propertyeditors.CustomDateEditor;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: BaoLei Li
 * @date: 2021/9/16
 **/
public class DatePropertyEditorRegistrar implements PropertyEditorRegistrar {

    @Override
    public void registerCustomEditors(PropertyEditorRegistry propertyEditorRegistry) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        propertyEditorRegistry.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
    }
}
