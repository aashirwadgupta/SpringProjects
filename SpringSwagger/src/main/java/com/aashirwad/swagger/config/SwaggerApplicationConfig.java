package com.aashirwad.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@Configuration
@EnableSwagger2WebMvc
@Import(SpringDataRestConfiguration.class)
public class SwaggerApplicationConfig {

	/**
	 * A Docket bean creation is where you can make several modifications
	 * as to what should or should not be shown in swagger.
	 * @return Docket object
	 */
	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build()
				.apiInfo(getApiInfo());
	}
	
	/**
	 * Method to create API metadata
	 * @return
	 */
	private ApiInfo getApiInfo() {
		return new ApiInfoBuilder()
				.title("Product API")
				.description("API for managing the products.")
				.version("1.0")
				.contact(new Contact("Aashirwad Gupta", "https://github.com/aashirwadgupta/", "aash.gutpta2@gmail.com"))
				.build();
	}
}
