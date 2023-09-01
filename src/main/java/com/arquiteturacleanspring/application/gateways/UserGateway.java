package com.arquiteturacleanspring.application.gateways;

import com.arquiteturacleanspring.domain.entity.User;

public interface UserGateway {
    User createUser(User user);
}
