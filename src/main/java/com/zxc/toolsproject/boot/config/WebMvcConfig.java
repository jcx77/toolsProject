package com.zxc.toolsproject.boot.config;

import com.zxc.toolsproject.commons.spring.mvc.converter.DateConverter;
import com.zxc.toolsproject.commons.spring.mvc.filter.CorsFilter;
import com.zxc.toolsproject.commons.spring.mvc.filter.XssFilter;
import com.zxc.toolsproject.commons.utils.JsonUtils;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.servlet.AbstractShiroFilter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
//	@Bean
//	public FilterRegistrationBean<CorsFilter> corsFilter() {
//		FilterRegistrationBean<CorsFilter> registration = new FilterRegistrationBean<CorsFilter>();
//		registration.setFilter(new CorsFilter());
//		registration.setName("corsFilter");
//		registration.addUrlPatterns("/api/*");
//		return registration;
//	}

//	@Bean
//	public FilterRegistrationBean<XssFilter> xssFilter() {
//		FilterRegistrationBean<XssFilter> registration = new FilterRegistrationBean<XssFilter>();
//		registration.setFilter(new XssFilter());
//		registration.setName("xssFilter");
//		registration.addUrlPatterns("/api/*");
//		return registration;
//	}

//	@Bean
//	public FilterRegistrationBean<AbstractShiroFilter> shiroFilter(ShiroFilterFactoryBean shiroFilterFactoryBean) throws Exception {
//		FilterRegistrationBean<AbstractShiroFilter> registration = new FilterRegistrationBean<AbstractShiroFilter>();
//		registration.setName("shiroFilter");
//		registration.setFilter((AbstractShiroFilter) shiroFilterFactoryBean.getObject());
//		registration.addUrlPatterns("/api/*");
//		return registration;
//	}

	@Bean
	public ObjectMapper objectMapper() {
		return JsonUtils.getObjectMapper();
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addRedirectViewController("/", "/view/html/login.html");
	}

	@Override
	public void addFormatters(FormatterRegistry registry) {
		registry.addConverter(new DateConverter());
	}
}