package com.arquiteturacleanspring.infrastructure.controllers;

public record CreateUserRequest(String username, String password, String email) {

}