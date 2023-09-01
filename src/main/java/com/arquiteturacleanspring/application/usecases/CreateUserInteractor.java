package com.arquiteturacleanspring.application.usecases;

import com.arquiteturacleanspring.application.gateways.UserGateway;
import com.arquiteturacleanspring.domain.entity.User;

public class CreateUserInteractor {
    private final UserGateway userGateway;

    public CreateUserInteractor(UserGateway createUser) {
        this.userGateway = createUser;
    }

    public User createUser(User user) {
        return userGateway.createUser(user);
    }
}

