package com.api.tweteroo.api.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserDto {
    @NotBlank
    @Size(max = 100, message = "username too long!")
    private String username;
    @NotBlank
    private String avatar;
}
