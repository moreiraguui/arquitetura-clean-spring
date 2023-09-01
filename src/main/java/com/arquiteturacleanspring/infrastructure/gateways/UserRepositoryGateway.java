package com.arquiteturacleanspring.infrastructure.gateways;

import com.arquiteturacleanspring.application.gateways.UserGateway;
import com.arquiteturacleanspring.domain.entity.User;
import com.arquiteturacleanspring.infrastructure.persistence.UserEntity;
import com.arquiteturacleanspring.infrastructure.persistence.UserRepository;


public class UserRepositoryGateway implements UserGateway {
    private final UserRepository userRepository;
    private final UserEntityMapper userEntityMapper;

    public UserRepositoryGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        this.userRepository = userRepository;
        this.userEntityMapper = userEntityMapper;
    }

    @Override
    public User createUser(User userDomainObj) {
        UserEntity userEntity = userEntityMapper.toEntity(userDomainObj);
        UserEntity savedEntity = userRepository.save(userEntity);

        return userEntityMapper.toDomainObj(savedEntity);
    }

}