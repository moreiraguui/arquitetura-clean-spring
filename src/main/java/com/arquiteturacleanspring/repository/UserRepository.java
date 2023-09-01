package com.arquiteturacleanspring.repository;

import com.arquiteturacleanspring.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}