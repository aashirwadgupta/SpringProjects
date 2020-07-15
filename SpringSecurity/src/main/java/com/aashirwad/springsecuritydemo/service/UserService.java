package com.aashirwad.springsecuritydemo.service;

import com.aashirwad.springsecuritydemo.transformers.views.UserView;
import com.aashirwad.springsecuritydemo.utils.constants.UserDummyData;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    public List<UserView> getAllUsers(){
        return UserDummyData.getAllUsers();
    }

    public Optional<UserView> getUser(Long userId){
        return UserDummyData.getAllUsers().stream().filter(user -> user.getUserId()==userId).findAny();
    }

    public UserView createUser(UserView userView){
        return UserDummyData.addUser(userView);
    }

    public boolean deleteUser(UserView userView){
        return UserDummyData.removeUser(userView);
    }
}
