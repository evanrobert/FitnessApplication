package com.FitnessAPP.Service;

import com.FitnessAPP.UserInfo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepository;

    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }
}

