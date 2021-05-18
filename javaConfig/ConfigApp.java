package javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("javaConfig")
public class ConfigApp {
	
	@Bean
	public Fortune fort()
	{
		return new Fortune();
	}
	
	@Bean
	public Coach hockeyCoach()
	{
		return new HockeyCoach(fort());
	}

}
