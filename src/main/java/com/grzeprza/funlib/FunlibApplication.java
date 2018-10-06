package com.grzeprza.funlib;

import nz.net.ultraq.thymeleaf.LayoutDialect;
import org.codehaus.groovy.runtime.ArrayUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ITemplateResolver;
import org.thymeleaf.util.ArrayUtils;

@SpringBootApplication
public class FunlibApplication {

	public static void main(String[] args) {
		SpringApplication.run(FunlibApplication.class, args);
	}

}
