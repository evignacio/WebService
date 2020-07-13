package com.exemple.webservice.service;

import org.springframework.stereotype.Service;
import webserviceresources.user.ObjectFactory;
import webserviceresources.user.User;
import webserviceresources.user.UserDetailRequest;
import webserviceresources.user.UserDetailResponse;
import webserviceservices.user.UserService;

import java.math.BigInteger;

@Service
public class UserServiceEndpoint implements UserService {

    @Override
    public UserDetailResponse getUserDetail(UserDetailRequest parameters) {
        ObjectFactory factory = new ObjectFactory();

        UserDetailResponse response = new UserDetailResponse();

        User user = new User();
        user.setId(BigInteger.valueOf(1));
        user.setName("Evandro Ignacio");
        user.setEmail("eignacio403#gmail.com");
        user.setPhone("(XX)XXXXX-XXXX");

        response.setUserDetail(user);
        return response;
    }
}
