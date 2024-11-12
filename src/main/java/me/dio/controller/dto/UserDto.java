package me.dio.controller.dto;

import me.dio.domain.model.User;

import java.util.List;

import static java.util.Collections.emptyList;
import static java.util.Optional.ofNullable;
import static java.util.stream.Collectors.toList;

public record UserDto(
        Long id,
        String name,
        String email,
        String phoneNumber,
        String observations) {

    public UserDto(User model) {
        this(
            model.getId(),
            model.getName(),
            model.getPhoneNumber(),
            model.getEmail(),
            model.getObservations()
        );
    }

    public User toModel() {
        User model = new User();
        model.setId(this.id);
        model.setName(this.name);
        model.setEmail(this.email);
        model.setPhoneNumber(this.phoneNumber);
        model.setObservations(this.observations);
        return model;
    }
}