package com.labproiect.demo.service.impl;

import com.labproiect.demo.service.UserBusiness;
import com.labproiect.demo.view.UserRepository;
import com.labproiect.demo.view.entity.UserView;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserImpl implements UserBusiness {

    public final UserRepository userRepository;

    @Override
    public UserView getUser(String login, String password) {
        final UserView user = userRepository.getByLoginAndPassword(login, password);
        if(user != null) {
            return user;
        }
        return new UserView();
    }
}
