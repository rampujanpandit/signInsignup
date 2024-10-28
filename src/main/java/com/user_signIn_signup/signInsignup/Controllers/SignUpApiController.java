package com.user_signIn_signup.signInsignup.Controllers;

import com.user_signIn_signup.signInsignup.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SignUpApiController {

    @Autowired
    UserService userService;

    @PostMapping("/user/signup")
    public ResponseEntity signUpNewUser(
            @RequestParam("name") String name,
            @RequestParam("email") String email,
            @RequestParam("password") String password,
            @RequestParam("phone") String phone) {

        if (name.isEmpty() || email.isEmpty() || password.isEmpty() || phone == null) {
            return new ResponseEntity<>("Please complete all required fields", HttpStatus.BAD_REQUEST);
        }


        // Encrypt/Hash password:
        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());

        // SignUp New User

        int result = userService.signupNewUserServiceMethod(name, email, hashedPassword, phone);

        if (result != 1){
            return new ResponseEntity<>("Failed to Registered User", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>("User SignUp Successfully", HttpStatus.OK);


        // SignUp New User
//        try {
//            userService.signupNewUserServiceMethod(name, email, hashedPassword, phone);
//            return new ResponseEntity<>("User Signup Successfully", HttpStatus.OK);
//        } catch (Exception e) {
//            e.printStackTrace(); // Log the exception stack trace
//            return new ResponseEntity<>("Failed to Signup user",  HttpStatus.BAD_REQUEST);
//        }

    }
}