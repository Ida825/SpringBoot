package cn.et.lesson02.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.support.http.StatViewServlet;

@Configuration
public class ConfigBean {
	
	/**
	 * 相当于：<bean id="druidStatView" class="...ServletRegistrationBean"></bean>
	 * @return
	 */
	
	@Bean
	public ServletRegistrationBean druidStatView() {
		ServletRegistrationBean srb = new ServletRegistrationBean();
		//设置servlet的名字
		srb.setName("DruidStatView");
		//设置servlet
		StatViewServlet ss = new StatViewServlet();
		srb.setServlet(ss);
		
		//设置路径
		String url="/druid/*";
		List<String> urls = new ArrayList<String>();
		urls.add(url);
		srb.setUrlMappings(urls);	
		//设置初始化参数：用户名和密码
		LinkedHashMap<String, String> LinkedHashMap = new LinkedHashMap<String, String>();
		LinkedHashMap.put("loginUsername","admin");
		LinkedHashMap.put("loginPassword", "123456");
		srb.setInitParameters(LinkedHashMap);
		
		return srb;
	}
}
