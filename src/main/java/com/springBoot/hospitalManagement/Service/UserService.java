package com.springBoot.hospitalManagement.Service;

import com.springBoot.hospitalManagement.Entity.User;

import java.util.Optional;

public interface UserService {

    public User saveUser(User user);

    public void removeSessionMessage();
}
