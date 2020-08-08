package com.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
class SwaggerConfiguration {
  @Bean
  def createRestApi():Docket ={
     new Docket(DocumentationType.SWAGGER_2)
      .apiInfo(apiInfo())
      .select()
      .apis(RequestHandlerSelectors.basePackage("com.web"))
      .paths(PathSelectors.any())
      .build()
  }

  def apiInfo():ApiInfo = {
    return new ApiInfoBuilder()
      .title("Scala Rest接口测试")
      .version("1.0")
      .description("API 描述")
      .build();
  }
}