package com.FitnessAPP.Service;

import com.FitnessAPP.Repos.UserRepo;
import com.FitnessAPP.UserInfo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepository;

    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }



    }


