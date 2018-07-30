package com.example.myspringboot.service;

import com.example.myspringboot.model.Outaccount;
import com.example.myspringboot.model.User;

public interface UserService {

        //登录
        public User login(String email, String password);

        //登录
        public Outaccount saveOutaccount(Outaccount outaccount);

}
