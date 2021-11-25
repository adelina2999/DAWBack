package com.labproiect.demo.service;

import com.labproiect.demo.view.entity.UserView;

public interface UserBusiness {

    UserView getUser(String login, String password);
}

