# Getting Started

### Reference Documentation
Some Good default pages to read

* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.2.6.RELEASE/reference/htmlsingle/#using-boot-devtools)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.2.6.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.2.6.RELEASE/reference/htmlsingle/#boot-features-jpa-and-spring-data)

### Guides
The following articles/answers/courses helped me understand and build whatever I did:

* [Pluralsight Course - Documenting Spring Data Rest APIs with Swagger and Springfox](https://app.pluralsight.com/library/courses/spring-framework-documenting-spring-data-rest-apis-swagger-springfox/table-of-contents)
* [Springfox Reference Documentation](https://springfox.github.io/springfox/docs/snapshot/)

#### Notes
[**@ApiModelProperty**](http://docs.swagger.io/swagger-core/v1.5.0/apidocs/io/swagger/annotations/ApiModelProperty.html) 
This annotation at the entity/domain object model level is to be only used 
when we have something meaningful to add to the property which is not obvious from the naming. 

[**@ApiOperation**](http://docs.swagger.io/swagger-core/v1.5.0/apidocs/io/swagger/annotations/ApiOperation.html)
This annotation adds two tags (value and notes). Where value appears at the top of the API and 
Notes appear below the method. 

To place validations at Bean/Entity level we can use springfox-bean-validatiors dependency and then
at the configuration class level in the @Import attributes we add BeanValidatorPluginsConfiguration class.

```
@Configuration
@EnableSwagger2WebMvc
@Import({SpringDataRestConfiguration.class, BeanValidatorPluginsConfiguration.class})
public class SwaggerApplicationConfig {
}
```

**PathSelectors** By using this we can restrict certain APIs to appear in our documentation.

**Swagger Groups** can be created by using groupName property on Docket bean in the config file. 
Change the path selector accordingly and modify the apiInfo method to getApiInfo for a particular
version. 