package com.example.myspringboot.service.impl;

import com.example.myspringboot.model.Outaccount;
import com.example.myspringboot.model.User;
import com.example.myspringboot.repo.OutaccountRepository;
import com.example.myspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
@Transactional(propagation= Propagation.REQUIRED,isolation= Isolation.DEFAULT)
public class UserServiceImpl implements UserService {
        @Autowired
        private OutaccountRepository outaccountRepository;

        @Override
        public User login(String email, String password) {
                return null;
        }

        @Override
        public Outaccount saveOutaccount(Outaccount outaccount) {
                return outaccountRepository.save(outaccount);
        }
}
