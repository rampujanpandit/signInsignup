package com.user_signIn_signup.signInsignup.services;

import com.user_signIn_signup.signInsignup.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public int signupNewUserServiceMethod(String name, String email, String password, String phone) {
        return userRepository.signUpNewUser(name, email, password, phone);

    }
}