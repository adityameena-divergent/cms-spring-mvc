package com.divergentsl.cms;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebMvc
@ComponentScan("com.divergentsl.cms")
public class WebConfig extends WebMvcConfigurerAdapter {

	@Bean
	public InternalResourceViewResolver jspViewResolver() {
		InternalResourceViewResolver bean = new InternalResourceViewResolver();
		bean.setPrefix("/WEB-INF/jsp/");
		bean.setSuffix(".jsp");
		return bean;
	}
	
//	@Override
//	public void configureViewResolvers(ViewResolverRegistry registry) {
//		// TODO Auto-generated method stub
//		WebMvcConfigurer.super.configureViewResolvers(registry);
//	}

//	public void addResourceHandlers(ResourceHandlerRegistry registry) {
////		// TODO Auto-generated method stub
////		WebMvcConfigurer.super.addResourceHandlers(registry);
//		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
//	}
	
	@Override
	 public void addResourceHandlers(ResourceHandlerRegistry registry) {
	        registry
	          .addResourceHandler("/resources/**")
	          .addResourceLocations("/resources/");	
	    }
	

}
