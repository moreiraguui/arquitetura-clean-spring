package com.arquiteturacleanspring.main;

import com.arquiteturacleanspring.application.gateways.UserGateway;
import com.arquiteturacleanspring.application.usecases.CreateUserInteractor;
import com.arquiteturacleanspring.infrastructure.controllers.UserDTOMapper;
import com.arquiteturacleanspring.infrastructure.gateways.UserEntityMapper;
import com.arquiteturacleanspring.infrastructure.gateways.UserRepositoryGateway;
import com.arquiteturacleanspring.infrastructure.persistence.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
    @Bean
    CreateUserInteractor createUserCase(UserGateway userGateway) {
        return new CreateUserInteractor(userGateway);
    }

    @Bean
    UserGateway userGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        return new UserRepositoryGateway(userRepository, userEntityMapper);
    }

    @Bean
    UserEntityMapper userEntityMapper() {
        return new UserEntityMapper();
    }

    @Bean
    UserDTOMapper userDTOMapper() {
        return new UserDTOMapper();
    }
}