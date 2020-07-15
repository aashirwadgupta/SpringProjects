package com.aashirwad.springsecuritydemo.utils.constants;

import com.aashirwad.springsecuritydemo.transformers.views.UserView;
import com.aashirwad.springsecuritydemo.utils.enums.UserRole;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserDummyData {
    static List<UserView> userList = new ArrayList<>();

    static {
        UserView firstUser = UserView.builder()
                .userName("FirstUser")
                .userDob(LocalDate.of(1990, 7, 9))
                .userRoles(Arrays.asList(UserRole.ADMIN, UserRole.USER, UserRole.SUPERUSER))
                .userId(1L)
                .userPassword("First@123")
                .build();
        UserView secondUser = UserView.builder()
                .userName("SecondUser")
                .userDob(LocalDate.of(1993, 9, 25))
                .userRoles(Arrays.asList(UserRole.USER, UserRole.SUPERUSER))
                .userId(2L)
                .userPassword("Second@123")
                .build();
        UserView thirdUser = UserView.builder()
                .userName("ThirdUser")
                .userDob(LocalDate.of(1995, 7, 7))
                .userRoles(Arrays.asList(UserRole.USER))
                .userId(3L)
                .userPassword("Third@123")
                .build();
        userList.add(firstUser);
        userList.add(secondUser);
        userList.add(thirdUser);
    }

    public static List<UserView> getAllUsers(){
        return userList;
    }

    public static UserView addUser(UserView userView){
        userView.setUserId(userList.size()+1L);
        userList.add(userView);
        return userView;
    }

    public static boolean removeUser(UserView userView){
        return userList.remove(userView);
    }
}
