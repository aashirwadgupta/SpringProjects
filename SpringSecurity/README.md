#**Notes while developing the project**
 
With basic authentication we do not have a default route for logout. If we try to hit that url it doesn't land us to 
proper place until we have created it. In the basic authentication for every request the username and 
password are sent. Performing the request via Postman we will observe that username and password are 
Base64 Encoded in the format Base64 username:password

###**Whitelisting**

To whitelist some pages we use the `antMatchers` specifying the urls which we are gonna skip from login or
a user using credentials to get access to

###**Custom Users**
To get away with a default user and everytime a new password, we override the `userDetailsService()` and create
a bean of `org.springframework.security.core.userdetails.UserDetailsService`. In this method we will connect with a 
database to get the `org.springframework.security.core.userdetails.User` to authenticate.

For first version we are using `org.springframework.security.core.userdetails.User.builder()` to build user for us with
some username and password.

Initially I used `org.springframework.security.provisioning.InMemoryUserDetailsManager` to have the user stored in the 
in-memory and for this we use `org.springframework.security.core.userdetails.UserDetails`.

Internally the Roles get resolved to `ROLE_<ROLE-STRING>`


###**Password Encoding**

[Why BCryptPasswordEncoder from Spring generate different outputs for same input?](https://stackoverflow.com/questions/25844419/why-bcryptpasswordencoder-from-spring-generate-different-outputs-for-same-input)

I am using a `org.springframework.security.crypto.password.PasswordEncoder` interface implementation to perform the 
password encoding. The encode method takes a `java.lang.CharSequence` input and returns an encoded string.

For the implementation I used `org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder` with a strength of 10.
[Can be any number ranging between 4 to 31](https://stackoverflow.com/questions/41542872/why-the-strength-of-bcryptpasswordencoder-is-in-between-4-and-31)

####More to read

-[Registration with Spring Security – Password Encoding](https://www.baeldung.com/spring-security-registration-password-encoding-bcrypt)
-[Official Doc](https://docs.spring.io/spring-security/site/docs/4.2.15.RELEASE/apidocs/org/springframework/security/crypto/bcrypt/BCryptPasswordEncoder.html)
