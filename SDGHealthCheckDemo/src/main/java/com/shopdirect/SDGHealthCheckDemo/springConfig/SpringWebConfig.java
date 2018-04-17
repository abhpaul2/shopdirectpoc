package com.shopdirect.SDGHealthCheckDemo.springConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@org.springframework.context.annotation.ComponentScan(basePackages={"com.shopdirect.SDGHealthCheckDemo"})
public class SpringWebConfig extends WebMvcConfigurerAdapter {
  
  @Bean
  public org.springframework.web.servlet.ViewResolver viewResolver()
  {
    InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
    viewResolver.setViewClass(org.springframework.web.servlet.view.JstlView.class);
    viewResolver.setPrefix("/WEB-INF/views/");
    viewResolver.setSuffix(".jsp");
    return viewResolver;
  }
  
  public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer)
  {
    configurer.enable();
  }
}
