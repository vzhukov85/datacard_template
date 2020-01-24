package ru.sb.datacard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication
public class DataCardApplication {

  public static void main(String[] args) {
    SpringApplication.run(DataCardApplication.class, args);
  }

  @Bean
  public Docket dataCardApi() {
    return new Docket(DocumentationType.SWAGGER_2).select()
        .apis(RequestHandlerSelectors.basePackage("ru.sb.datacard")).build();
  }

}
