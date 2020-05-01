# Versioning Spring Data REST APIs

### Guides
The following guides illustrate how to use some features concretely:

* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Working with Spring H2](https://www.baeldung.com/spring-boot-h2-database)
* [Spring Framework: Versioning Spring Data REST APIs](https://app.pluralsight.com/library/courses/spring-framework-versioning-spring-data-rest-apis)

#### Versioning Strategies
- URI
    - Simple to implement.Version is embedded somewhere in the URI, usually in the root. ex `api/v1` or `api/v2`
    - Works with API URI caching.
    - With every versioning all api needs to be updated and testing becomes big
- Media Type
    - When using this approach we have to define vendor specific media types, which can be used at server side
    to determine which version to call.
    - For ex - `application/json` to `application/employee.v1+json` or `application/employee.v2+json`
    - Can be a confusing approach since non standard media type are being used.
- Custom Header
    - Similar to Media type, just that instead of using existing header, we define a custom header.
    Server looks for that header and determine which API version to call.
    - URI need not be changed doing this.
    - For example, defining a custom header as `Accept-Version: v1` or `Accept-Version: v2`
- Request Parameter
    - Can define a parameter to define which version to use when an API is invoked.
    - For example, `/api/employees?version=v1` or `/api/employees?version=v2`
- No Strategy
    - Simplified Server side logic, no header, no uri modification, no fuss.
    - Whenever you wish to change the functionality just add one of the above versioninig strategy
    and let the previous/old be the default versioning strategy.
    
    ##### Now to implement the URI versioning across all APIs
    `@BasePathAwareController` is need to be added in the controller classes to be aware about the added 
    base path using the property `spring.data.rest.base-path`
