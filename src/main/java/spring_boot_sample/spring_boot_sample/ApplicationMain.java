package spring_boot_sample.spring_boot_sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableAutoConfiguration
@ComponentScan //组件扫描
public class ApplicationMain {
	public static void main(String[] args) {
		//Spring boot项目的唯一入口
		SpringApplication.run(ApplicationMain.class, args);
	}
}
