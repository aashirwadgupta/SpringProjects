package com.aashirwad.springsecuritydemo.transformers.views;

import com.aashirwad.springsecuritydemo.utils.enums.UserRole;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Builder
public class UserView {

    private Long userId;
    private String userName;
    private String userPassword;
    private LocalDate userDob;
    private List<UserRole> userRoles;

}
