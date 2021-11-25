/*
 * Copyright (c) 2021 iChochy
 * URL:https://ichochy.com
 * Date:2021/11/25 19:54:25
 */

package com.ichochy.example;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");

    }
}
