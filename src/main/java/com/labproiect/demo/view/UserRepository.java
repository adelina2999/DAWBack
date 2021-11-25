package com.labproiect.demo.view;

import com.labproiect.demo.view.entity.UserView;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserView, Long> {
    UserView getByLoginAndPassword(String login, String password);
}
