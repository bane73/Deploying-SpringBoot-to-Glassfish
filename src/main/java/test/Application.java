package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application extends SpringBootServletInitializer {

	
	public static void main( String[] args ) throws Exception {
		SpringApplication.run( applicationClass, args );
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {		
		System.out.println("Initializing the WebXml!");		
        return application.sources(applicationClass);
    }

    private static Class<Application> applicationClass = Application.class;
	
}
