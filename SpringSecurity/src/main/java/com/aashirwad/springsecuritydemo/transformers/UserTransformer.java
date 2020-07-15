package com.aashirwad.springsecuritydemo.transformers;

import com.aashirwad.springsecuritydemo.transformers.views.UserView;

public class UserTransformer {

    public UserView transformUserEntityToView(){
        return UserView.builder().build();
    }
}
