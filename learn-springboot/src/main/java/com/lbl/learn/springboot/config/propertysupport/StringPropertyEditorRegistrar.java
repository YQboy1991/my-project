package com.lbl.learn.springboot.config.propertysupport;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;

/**
 * @author: BaoLei Li
 * @date: 2021/9/16
 **/
public class StringPropertyEditorRegistrar implements PropertyEditorRegistrar {

    @Override
    public void registerCustomEditors(PropertyEditorRegistry propertyEditorRegistry) {
        propertyEditorRegistry.registerCustomEditor(String.class, new StringTrimmerEditor(true));
    }
}
