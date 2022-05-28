package academy.learnprogramming.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Component
@ComponentScan(basePackages = "academy.learnprogramming")
public class WebConfig {

}
