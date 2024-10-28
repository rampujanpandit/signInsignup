package com.user_signIn_signup.signInsignup.repository;

import com.user_signIn_signup.signInsignup.models.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Transactional
    @Modifying
    @Query(value = "INSERT INTO users(name, email, password, phone) " +
            "VALUES (:name, :email, :password, :phone)", nativeQuery = true)
    int signUpNewUser(
            @Param("name") String name,
            @Param("email") String email,
            @Param("password") String password,
            @Param("phone") String phone
    );

}