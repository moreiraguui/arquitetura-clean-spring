package com.arquiteturacleanspring;

import com.arquiteturacleanspring.model.User;
import com.arquiteturacleanspring.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User create(User user) {
        return userRepository.save(user);
    }
    public List<User> listar() {
        return (List<User>) userRepository.findAll();
    }
}