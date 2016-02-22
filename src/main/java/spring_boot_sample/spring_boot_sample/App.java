package spring_boot_sample.spring_boot_sample;

import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.collect.Lists;

/**
 * Hello world!
 *
 */
@Controller
@EnableAutoConfiguration
public class App 
{
	@NotNull
	private String name;
	
	@RequestMapping("/hello")
	@ResponseBody
	public Map<String,Object>hello(Map<String,Object> model){
		List<String> l= Lists.newArrayList();
	    l.add("哈喽，hadoop");  
	    l.add("哈喽，hbase");  
	    l.add("哈喽，hive");  
	    l.add("哈喽，pig");  
	    l.add("哈喽，zookeeper");  
	    l.add("哈喽，三劫散仙");  
	    //将数据存放map里面，可以直接在velocity页面，使用key访问  
	    model.put("data",l); 
		return model;
	}
   
}
